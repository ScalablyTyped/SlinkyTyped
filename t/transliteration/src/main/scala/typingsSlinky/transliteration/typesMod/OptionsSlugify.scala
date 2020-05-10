package typingsSlinky.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.transliteration.typesMod.Options because Already inherited */ @js.native
trait OptionsSlugify extends OptionsTransliterate {
  /**
    * Allowed characters.
    * When `allowedChars` is set to `'abc'`, then only characters match `/[abc]/g` will be preserved.
    * Other characters will all be converted to `separator`
    * @default 'a-zA-Z0-9-_.~''
    */
  var allowedChars: js.UndefOr[String] = js.native
  /**
    * Whether the result need to be converted into lowercase
    * @default true
    */
  var lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Custom separator string
    * @default '-'
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Whether the result need to be converted into uppercase
    * @default false
    */
  var uppercase: js.UndefOr[Boolean] = js.native
}

object OptionsSlugify {
  @scala.inline
  def apply(): OptionsSlugify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSlugify]
  }
  @scala.inline
  implicit class OptionsSlugifyOps[Self <: OptionsSlugify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedChars")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.undefined)
        ret
    }
  }
  
}

