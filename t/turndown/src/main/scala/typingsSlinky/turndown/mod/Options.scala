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

trait Options extends js.Object {
  var blankReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var br: js.UndefOr[String] = js.undefined
  var bulletListMarker: js.UndefOr[`-_` | Plussign | Asterisk] = js.undefined
  var codeBlockStyle: js.UndefOr[indented | fenced] = js.undefined
  var defaultReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var emDelimiter: js.UndefOr[_underscore | Asterisk] = js.undefined
  var fence: js.UndefOr[GraveaccentGraveaccentGraveaccent | TildeTildeTilde] = js.undefined
  var headingStyle: js.UndefOr[setext | atx] = js.undefined
  var hr: js.UndefOr[String] = js.undefined
  var keepReplacement: js.UndefOr[ReplacementFunction] = js.undefined
  var linkReferenceStyle: js.UndefOr[full | collapsed | shortcut] = js.undefined
  var linkStyle: js.UndefOr[inlined | referenced] = js.undefined
  var strongDelimiter: js.UndefOr[__ | AsteriskAsterisk] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blankReplacement: (/* content */ String, /* node */ Node, /* options */ Options) => String = null,
    br: String = null,
    bulletListMarker: `-_` | Plussign | Asterisk = null,
    codeBlockStyle: indented | fenced = null,
    defaultReplacement: (/* content */ String, /* node */ Node, /* options */ Options) => String = null,
    emDelimiter: _underscore | Asterisk = null,
    fence: GraveaccentGraveaccentGraveaccent | TildeTildeTilde = null,
    headingStyle: setext | atx = null,
    hr: String = null,
    keepReplacement: (/* content */ String, /* node */ Node, /* options */ Options) => String = null,
    linkReferenceStyle: full | collapsed | shortcut = null,
    linkStyle: inlined | referenced = null,
    strongDelimiter: __ | AsteriskAsterisk = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (blankReplacement != null) __obj.updateDynamic("blankReplacement")(js.Any.fromFunction3(blankReplacement))
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (bulletListMarker != null) __obj.updateDynamic("bulletListMarker")(bulletListMarker.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (defaultReplacement != null) __obj.updateDynamic("defaultReplacement")(js.Any.fromFunction3(defaultReplacement))
    if (emDelimiter != null) __obj.updateDynamic("emDelimiter")(emDelimiter.asInstanceOf[js.Any])
    if (fence != null) __obj.updateDynamic("fence")(fence.asInstanceOf[js.Any])
    if (headingStyle != null) __obj.updateDynamic("headingStyle")(headingStyle.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr.asInstanceOf[js.Any])
    if (keepReplacement != null) __obj.updateDynamic("keepReplacement")(js.Any.fromFunction3(keepReplacement))
    if (linkReferenceStyle != null) __obj.updateDynamic("linkReferenceStyle")(linkReferenceStyle.asInstanceOf[js.Any])
    if (linkStyle != null) __obj.updateDynamic("linkStyle")(linkStyle.asInstanceOf[js.Any])
    if (strongDelimiter != null) __obj.updateDynamic("strongDelimiter")(strongDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

