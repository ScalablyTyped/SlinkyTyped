package typingsSlinky.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMember extends js.Object {
  var apiKey: String = js.native
  var apiUser: String = js.native
  def addListMember(mail_list_addr: String, member_addr: String, name: String, options: ListMemberAddOptions): js.Promise[ListMemberAddResposne] = js.native
  def addToOtherList(sourceList: String, targetList: String): js.Promise[js.Array[ListMemberAddResposne]] = js.native
  def deleteListMember(mail_list_addr: String, member_addr: String): js.Promise[ListMemberDeleteResposne] = js.native
  def getData(url: String, data: js.Object): js.Promise[js.Object] = js.native
  def getListMember(mail_list_addr: String, options: ListMemberListOptions): js.Promise[ListMemberListResponse] = js.native
}

object ListMember {
  @scala.inline
  def apply(
    addListMember: (String, String, String, ListMemberAddOptions) => js.Promise[ListMemberAddResposne],
    addToOtherList: (String, String) => js.Promise[js.Array[ListMemberAddResposne]],
    apiKey: String,
    apiUser: String,
    deleteListMember: (String, String) => js.Promise[ListMemberDeleteResposne],
    getData: (String, js.Object) => js.Promise[js.Object],
    getListMember: (String, ListMemberListOptions) => js.Promise[ListMemberListResponse]
  ): ListMember = {
    val __obj = js.Dynamic.literal(addListMember = js.Any.fromFunction4(addListMember), addToOtherList = js.Any.fromFunction2(addToOtherList), apiKey = apiKey.asInstanceOf[js.Any], apiUser = apiUser.asInstanceOf[js.Any], deleteListMember = js.Any.fromFunction2(deleteListMember), getData = js.Any.fromFunction2(getData), getListMember = js.Any.fromFunction2(getListMember))
    __obj.asInstanceOf[ListMember]
  }
  @scala.inline
  implicit class ListMemberOps[Self <: ListMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListMember(value: (String, String, String, ListMemberAddOptions) => js.Promise[ListMemberAddResposne]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListMember")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddToOtherList(value: (String, String) => js.Promise[js.Array[ListMemberAddResposne]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToOtherList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteListMember(value: (String, String) => js.Promise[ListMemberDeleteResposne]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteListMember")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetData(value: (String, js.Object) => js.Promise[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetListMember(value: (String, ListMemberListOptions) => js.Promise[ListMemberListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListMember")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

