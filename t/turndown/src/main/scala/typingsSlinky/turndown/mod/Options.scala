package typingsSlinky.turndown.mod

import typingsSlinky.turndown.turndownStrings.Asterisk
import typingsSlinky.turndown.turndownStrings.AsteriskAsterisk
import typingsSlinky.turndown.turndownStrings.GraveaccentGraveaccentGraveaccent
import typingsSlinky.turndown.turndownStrings.Plussign
import typingsSlinky.turndown.turndownStrings.TildeTildeTilde
import typingsSlinky.turndown.turndownStrings.__
import typingsSlinky.turndown.turndownStrings._underscore
import typingsSlinky.turndown.turndownStrings.`-_`
import typingsSlinky.turndown.turndownStrings.atx
import typingsSlinky.turndown.turndownStrings.collapsed
import typingsSlinky.turndown.turndownStrings.fenced
import typingsSlinky.turndown.turndownStrings.full
import typingsSlinky.turndown.turndownStrings.indented
import typingsSlinky.turndown.turndownStrings.inlined
import typingsSlinky.turndown.turndownStrings.referenced
import typingsSlinky.turndown.turndownStrings.setext
import typingsSlinky.turndown.turndownStrings.shortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var blankReplacement: js.UndefOr[ReplacementFunction] = js.native
  var br: js.UndefOr[String] = js.native
  var bulletListMarker: js.UndefOr[`-_` | Plussign | Asterisk] = js.native
  var codeBlockStyle: js.UndefOr[indented | fenced] = js.native
  var defaultReplacement: js.UndefOr[ReplacementFunction] = js.native
  var emDelimiter: js.UndefOr[_underscore | Asterisk] = js.native
  var fence: js.UndefOr[GraveaccentGraveaccentGraveaccent | TildeTildeTilde] = js.native
  var headingStyle: js.UndefOr[setext | atx] = js.native
  var hr: js.UndefOr[String] = js.native
  var keepReplacement: js.UndefOr[ReplacementFunction] = js.native
  var linkReferenceStyle: js.UndefOr[full | collapsed | shortcut] = js.native
  var linkStyle: js.UndefOr[inlined | referenced] = js.native
  var strongDelimiter: js.UndefOr[__ | AsteriskAsterisk] = js.native
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
    def withBlankReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankReplacement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBlankReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankReplacement")(js.undefined)
        ret
    }
    @scala.inline
    def withBr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
    @scala.inline
    def withBulletListMarker(value: `-_` | Plussign | Asterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletListMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletListMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletListMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeBlockStyle(value: indented | fenced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeBlockStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeBlockStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeBlockStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReplacement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDefaultReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultReplacement")(js.undefined)
        ret
    }
    @scala.inline
    def withEmDelimiter(value: _underscore | Asterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withFence(value: GraveaccentGraveaccentGraveaccent | TildeTildeTilde): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fence")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingStyle(value: setext | atx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepReplacement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutKeepReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepReplacement")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkReferenceStyle(value: full | collapsed | shortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkReferenceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkReferenceStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkReferenceStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkStyle(value: inlined | referenced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStrongDelimiter(value: __ | AsteriskAsterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrongDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongDelimiter")(js.undefined)
        ret
    }
  }
  
}

