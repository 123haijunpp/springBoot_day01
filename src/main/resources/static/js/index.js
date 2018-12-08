$(document).ready(function () {
    layui.use('table', function () {
        var table = layui.table;
        // JS渲染表格
        table.render({
            elem: '#demo'    // 表格选择器
            , toolbar: '#toolbarDemo'    //工具栏
            , defaultToolbar: ['filter', 'print', 'exports']
            , height: 570
            , url: 'user/userList'    // 数据接口
            , title: '用户数据表'
            , page: true //开启分页
            , cols: [[ //表头
                {field: 'id', title: 'ID', width: 100, sort: true, fixed: 'left'}
                , {field: 'username', title: '用户名', width: 280}
                , {field: 'password', title: '密码', width: 280}
                , {field: 'email', title: '资产', width: 180, sort: true}
                , {field: 'useable', title: '状态', width: 180}
                , {field: 'addtime', title: '创建时间', width: 212}
                , {field: 'logintime', title: '创建时间', width: 212}
                , {field: 'loginip', title: '创建时间', width: 212}
                , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 267}
            ]]
        });
        // 监听行工具事件
        table.on('tool(demo)', function (obj) { // 注：tool是工具条事件名，demo是table原始容器的容器的属性， lay-filter='对应的值'
            var data = obj.data;   // 获取当前行的数据
            // 获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            if (obj.event === 'del') {
                layer.confirm('你确定要删除？', function (index) {
                    //向服务端发送删除指令
                    delUser(data.id, obj, index);
                });
            }
            if (obj.event === 'edit') {
                editUser(data);
            }
            if (obj.event === 'imgUpload') {
                imageUpload(data.id);
            }
            if (obj.event === 'view-details') {

            }
        });
    });
});