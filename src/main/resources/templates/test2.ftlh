<html>
    <head>
        <title>hi ${student.name}</title>
    </head>
    <body>
        I'm ${student.name} , I'm ${student.age} years old. My best friend is ${student.bestFriend.name};
        I have many friends :
        <ul>
            <#list student.friends as friend>
                <li>${friend_index}, name: ${friend.name}, age: ${friend.age}, money: ${friend.money}</li>
            </#list>
        </ul>
        遍历map:
       <ul>
           <#list other?keys as k>
                <li>
                     ${k_index + 1} , ${other[k].name}
                </li>
           </#list>
       </ul>
        测试小数逗号分隔:
            ${dotMoney?c}<br/>
        测试将json转成对象:
        <#assign text="{'bank':'工商银行','account':'10101920201920212'}" />
        <#assign data=text?eval />
        开户行：${data.bank} 账号：${data.account}
    </body>

</html>