package typingsSlinky.svgSpriteLoader.pluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Render plain sprite without styles and usages */
  var plainSprite: js.UndefOr[Boolean] = js.native
  /** Custom tag attributes for the svg */
  var spriteAttrs: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    def withPlainSprite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainSprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withSpriteAttrs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpriteAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spriteAttrs")(js.undefined)
        ret
    }
  }
  
}

