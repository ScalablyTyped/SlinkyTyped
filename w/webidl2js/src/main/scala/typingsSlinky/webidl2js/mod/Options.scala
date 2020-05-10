package typingsSlinky.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		 * The optional suffix present on implementation files.
  		 *
  		 * @default ""
  		 */
  var implSuffix: js.UndefOr[String] = js.native
  /**
  		 * The function used to modify attributes and operations
  		 * with the `[CEReactions]` extended attribute.
  		 *
  		 * The default value is the identity function.
  		 */
  var processCEReactions: js.UndefOr[CodeProcessor] = js.native
  /**
  		 * The function used to modify attributes and operations
  		 * with the `[HTMLConstructor]` extended attribute.
  		 *
  		 * The default value is the identity function.
  		 */
  var processHTMLConstructor: js.UndefOr[CodeProcessor] = js.native
  /**
  		 * The function used to generate attributes and operations
  		 * with the `[Reflect]` extended attribute.
  		 *
  		 * @default null
  		 */
  var processReflect: js.UndefOr[AttributeProcessor | Null] = js.native
  /**
  		 * Whether non-fatal errors should be ignored.
  		 *
  		 * @default false
  		 */
  var suppressErrors: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCEReactions(value: CodeProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCEReactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessCEReactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCEReactions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessHTMLConstructor(value: CodeProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHTMLConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessHTMLConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHTMLConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessReflect(value: AttributeProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processReflect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessReflect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processReflect")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessReflectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processReflect")(null)
        ret
    }
    @scala.inline
    def withSuppressErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrors")(js.undefined)
        ret
    }
  }
  
}

