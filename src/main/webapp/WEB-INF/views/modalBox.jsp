<%--
  Created by IntelliJ IDEA.
  User: 007
  Date: 2018/5/5
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Title</title>
    <script type="text/javascript"
            src="${APP_PATH}/static/js/jquery-3.3.1.js"></script>
    <script src="${APP_PATH}/static/js/tool.js"></script>
</head>
<body>

<div class="modal fade" id="purchaseList" tabindex="-1" role="dialog" aria-labelledby="purchaseList">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">进货单</h4>
            </div>
            <form id="supplier_item_form">
                <div class="modal-body">

                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="supplier_out"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            供应商
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" id="supplier_out_list" aria-labelledby="supplier_out">

                        </ul>
                        联系人:<input type="text" name="companyName" id="companyName" style="width: 100px;"/>
                        联系电话:<input type="text" name="tel" id="tel" style="width: 100px;"/>
                        联系邮箱:<input type="text" name="mail" id="mail" style="width: 100px;"/>

                    </div>
                    <table class="table table-bordered" id="purchaseList_table_input">
                        <tr>
                            <td class="active">商品名称</td>
                            <td class="danger">单价</td>
                            <td class="info">数量</td>
                        </tr>
                        <tr>
                            <td class="active"><input type="text" name="commodityInfo.itemName" style="width: 100px;">
                            </td>
                            <td class="active"><input type="text" name="commodityInfo.price" style="width: 100px;"
                                                      value="0.0"></td>
                            <td class="active"><input type="text" name="commodityInfo.amount" style="width: 100px;"
                                                      value="0"></td>
                            <input type="hidden" name="commodityInfo.supplierName" id="hidden_supplierName">
                            <input type="hidden" name="id" id="hidden_id">
                            <input type="hidden" name="supplierName" id="hidden_supplier_Name">
                        </tr>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="supplier_submit_input">保存</button>
                </div>
            </form>
        </div>
    </div>
</div>

<div class="modal fade" id="salesTicket" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">销售单</h4>
            </div>
            <form id="sell_item_form">
                <div class="modal-body">
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="client_out"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            客户
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" id="client_out_list" aria-labelledby="client_out">

                        </ul>
                        联系人:<input type="text" name="customentName" id="customentName" style="width: 100px;"/>
                        联系电话:<input type="text" name="tel" id="tel" style="width: 100px;"/>
                        联系邮箱:<input type="text" name="mail" id="mail" style="width: 100px;"/>

                    </div>
                    <table class="table table-bordered" id="salesTicket_table_input">
                        <tr>
                            <td class="active">商品名称</td>
                            <td class="danger">销售单价</td>
                            <td class="info">销售数量</td>
                        </tr>
                        <tr>
                            <td class="active" id="item_td">
                                <button class="btn btn-default dropdown-toggle" type="button" id="sell_item"
                                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                    销售物品
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" id="sell_item_list" aria-labelledby="sell_item">

                                </ul>
                            </td>
                            <td class="active"><input type="text" name="sellMoney" style="width: 100px;"
                                                      value="0.0" id="item_price"></td>
                            <td class="active"><input type="text" name="sellItemAmount" style="width: 100px;"
                                                      value="0" id="item_amount"></td>
                            <input type="hidden" name="itemId" id="hidden_item_id">
                        </tr>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="item_add_button">添加</button>
                </div>
            </form>
        </div>

    </div>
</div>
<script type="text/javascript" >
    $("#item_add_button").click(function () {
        var price = $("#item_price").val()
        var amount = $("#item_amount").val();
        if($("#item_td").find("H3").length>0){
            if (chkNumber(price)) {
                if (chkInt(amount)) {
                    $.ajax({
                        url: "${APP_PATH}/addItemRecord",
                        type: "POST",
                        data: $("#sell_item_form").serialize(),
                        success: function (result) {
                            console.log(result);
                        }
                    })
                }else{
                    alert("销售数量必须是整数");
                }
            } else {
                alert("销售单价不是整数或小数");
            }
        }else{
            alert("请选择商品");
        }
        $('#salesTicket').modal('hide');
    })


    <%--获取所有销售物品的请求--%>
    $("#sell_item").click(function () {
        $.ajax({
            url: "${APP_PATH}/getAllItem",
            type: "GET",
            success: function (result) {
                var sell_item_list = $("#sell_item_list")
                sell_item_list.find("li").remove()
                $("#item_td").find("h3").remove()
                $.each(result, function (index, item) {
                    sell_item_list.append("<li><a href=\"#\" id = " + item.id + ">" + item.itemName + "</a></li>")
                })
                sell_item_list.find("a").click(function () {
                    $("#item_td").append("<h3 id=" + $(this).attr("id") + "  style=\"display:inline;\">" + $(this).html() + "</h3>")
                    $("#hidden_item_id").val($(this).attr("id"))
                })
            }
        })
    })

    $("#client_out").click(function () {
        $.ajax({
            url: "${APP_PATH}/getAllCustomer",
            type: "GET",
            success: function (result) {
                var client_out_list = $("#client_out_list")
                client_out_list.find("li").remove()
                $.each(result, function (index, item) {
                    client_out_list.append("<li><a href=\"#\" id = " + index + ">" + item.customentName + "</a></li>")
                })
                client_out_list.find("li").find("a").click(function () {
                    var id = $(this).attr("id")
                    var salesTicket = $("#salesTicket")
                    salesTicket.find("#customentName").val(result[id].customentName)
                    salesTicket.find("#tel").val(result[id].tel)
                    salesTicket.find("#mail").val(result[id].mail)

                })
            }

        })
    })
</script>


<script type="text/javascript">
    $("#supplier_out").click(function () {
        $.ajax({
            url: "${APP_PATH}/getAllSupplier",
            type: "GET",
            success: function (result) {
                var supplier_out_list = $("#supplier_out_list")
                supplier_out_list.find("li").remove()
                $.each(result, function (index, item) {
                    supplier_out_list.append("<li><a href=\"#\" id = " + index + ">" + item.supplierName + "</a></li>")
                })
                supplier_out_list.find("li").find("a").click(function () {
                    var id = $(this).attr("id")
                    $("#hidden_supplier_Name").val(result[id].supplierName)
                    $("#hidden_id").val(result[id].id)
                    $("#hidden_supplierName").val(result[id].supplierName)
                    $("#companyName").val(result[id].companyName)
                    $("#tel").val(result[id].tel)
                    $("#mail").val(result[id].mail)

                })
            }
        })
    })
    $("#supplier_submit_input").click(function () {
        $.ajax({
            url: "${APP_PATH}/insertItem",
            type: "POST",
            data: $("#supplier_item_form").serialize(),
            success: function (result) {
                $('#purchaseList').modal('hide');
            }
        })
    })



    //匹配整数
    function chkInt(number) {
        var NumberChk = /^[0-9]+$/;
        if (NumberChk.test(number)) {
            return true;
        }
        return false;
    }

    //匹配小数
    function chkNumber(number) {
        var NumberChk = /^[0-9]+$|^([0-9]+[.][0-9]+)$/;
        if (NumberChk.test(number)) {
            return true;
        } else {
            return false;
        }
    }
</script>
</body>
</html>
