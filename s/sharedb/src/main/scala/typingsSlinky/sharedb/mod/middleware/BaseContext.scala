package typingsSlinky.sharedb.mod.middleware

import typingsSlinky.sharedb.agentMod.^
import typingsSlinky.sharedb.mod.sharedb
import typingsSlinky.sharedb.sharedbStrings.afterSubmit
import typingsSlinky.sharedb.sharedbStrings.apply
import typingsSlinky.sharedb.sharedbStrings.commit
import typingsSlinky.sharedb.sharedbStrings.connect
import typingsSlinky.sharedb.sharedbStrings.doc
import typingsSlinky.sharedb.sharedbStrings.op
import typingsSlinky.sharedb.sharedbStrings.query
import typingsSlinky.sharedb.sharedbStrings.readSnapshots
import typingsSlinky.sharedb.sharedbStrings.receive
import typingsSlinky.sharedb.sharedbStrings.reply
import typingsSlinky.sharedb.sharedbStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseContext extends js.Object {
  
  var action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit = js.native
  
  var agent: ^ = js.native
  
  var backend: sharedb = js.native
}
object BaseContext {
  
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb
  ): BaseContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseContext]
  }
  
  @scala.inline
  implicit class BaseContextOps[Self <: BaseContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(
      value: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgent(value: ^): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: sharedb): Self = this.set("backend", value.asInstanceOf[js.Any])
  }
}
