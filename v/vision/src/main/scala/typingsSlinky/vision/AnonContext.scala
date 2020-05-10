package typingsSlinky.vision

import typingsSlinky.vision.mod.ViewHandlerOrReplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext extends js.Object {
  /** optional object used by the template to render context-specific result. Defaults to no context {}. */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * optional object used to override the server's views manager configuration for this response.
    * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * TODO check if it can have `defaultExtension`.
    */
  var options: js.UndefOr[ViewHandlerOrReplyOptions] = js.native
  /** the template filename and path, relative to the templates path configured via the server views manager. */
  var template: String = js.native
}

object AnonContext {
  @scala.inline
  def apply(template: String): AnonContext = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
  @scala.inline
  implicit class AnonContextOps[Self <: AnonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ViewHandlerOrReplyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

