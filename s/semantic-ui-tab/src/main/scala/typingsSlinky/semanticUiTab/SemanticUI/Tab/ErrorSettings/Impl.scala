package typingsSlinky.semanticUiTab.SemanticUI.Tab.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'You attempted to load content without API module'
    */
  var api: String = js.native
  /**
    * @default 'The method you called is not defined'
    */
  var method: String = js.native
  /**
    * @default 'Activated tab cannot be found for this context.'
    */
  var missingTab: String = js.native
  /**
    * @default 'The tab you specified is missing a content url.'
    */
  var noContent: String = js.native
  /**
    * @default 'History enabled, but no path was specified'
    */
  var path: String = js.native
  /**
    * @default 'Max recursive depth reached'
    */
  var recursion: String = js.native
  /**
    * @default 'The state library has not been initialized'
    */
  var state: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    api: String,
    method: String,
    missingTab: String,
    noContent: String,
    path: String,
    recursion: String,
    state: String
  ): Impl = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], missingTab = missingTab.asInstanceOf[js.Any], noContent = noContent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

