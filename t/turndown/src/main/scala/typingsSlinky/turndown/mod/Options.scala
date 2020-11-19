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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlankReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = this.set("blankReplacement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBlankReplacement: Self = this.set("blankReplacement", js.undefined)
    
    @scala.inline
    def setBr(value: String): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    
    @scala.inline
    def setBulletListMarker(value: `-_` | Plussign | Asterisk): Self = this.set("bulletListMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletListMarker: Self = this.set("bulletListMarker", js.undefined)
    
    @scala.inline
    def setCodeBlockStyle(value: indented | fenced): Self = this.set("codeBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeBlockStyle: Self = this.set("codeBlockStyle", js.undefined)
    
    @scala.inline
    def setDefaultReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = this.set("defaultReplacement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDefaultReplacement: Self = this.set("defaultReplacement", js.undefined)
    
    @scala.inline
    def setEmDelimiter(value: _underscore | Asterisk): Self = this.set("emDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmDelimiter: Self = this.set("emDelimiter", js.undefined)
    
    @scala.inline
    def setFence(value: GraveaccentGraveaccentGraveaccent | TildeTildeTilde): Self = this.set("fence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFence: Self = this.set("fence", js.undefined)
    
    @scala.inline
    def setHeadingStyle(value: setext | atx): Self = this.set("headingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingStyle: Self = this.set("headingStyle", js.undefined)
    
    @scala.inline
    def setHr(value: String): Self = this.set("hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHr: Self = this.set("hr", js.undefined)
    
    @scala.inline
    def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = this.set("keepReplacement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteKeepReplacement: Self = this.set("keepReplacement", js.undefined)
    
    @scala.inline
    def setLinkReferenceStyle(value: full | collapsed | shortcut): Self = this.set("linkReferenceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkReferenceStyle: Self = this.set("linkReferenceStyle", js.undefined)
    
    @scala.inline
    def setLinkStyle(value: inlined | referenced): Self = this.set("linkStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkStyle: Self = this.set("linkStyle", js.undefined)
    
    @scala.inline
    def setStrongDelimiter(value: __ | AsteriskAsterisk): Self = this.set("strongDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrongDelimiter: Self = this.set("strongDelimiter", js.undefined)
  }
}
