package typingsSlinky.semanticUiNag.SemanticUI.Nag.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default '$.cookie is not included. A storage solution is required.'
    */
  var noCookieStorage: String = js.native
  /**
    * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
    */
  var noStorage: String = js.native
}

object Impl {
  @scala.inline
  def apply(method: String, noCookieStorage: String, noStorage: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noCookieStorage = noCookieStorage.asInstanceOf[js.Any], noStorage = noStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoCookieStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCookieStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStorage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

