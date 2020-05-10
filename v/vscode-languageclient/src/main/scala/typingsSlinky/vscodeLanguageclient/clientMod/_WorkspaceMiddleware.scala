package typingsSlinky.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WorkspaceMiddleware extends js.Object {
  var didChangeConfiguration: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* sections */ js.UndefOr[js.Array[String]], 
      /* next */ DidChangeConfigurationSignature, 
      Unit
    ]
  ] = js.native
}

object _WorkspaceMiddleware {
  @scala.inline
  def apply(): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
  @scala.inline
  implicit class _WorkspaceMiddlewareOps[Self <: _WorkspaceMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidChangeConfiguration(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* sections */ js.UndefOr[js.Array[String]], 
          /* next */ DidChangeConfigurationSignature, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidChangeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeConfiguration")(js.undefined)
        ret
    }
  }
  
}

