package typingsSlinky.stringPixelWidth.mod

import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`andale mono`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`avenir next`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`comic sans ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`courier new`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`open sans`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`times new roman`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.`trebuchet ms`
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.arial
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.avenir
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.georgia
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.impact
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.tahoma
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.verdana
import typingsSlinky.stringPixelWidth.stringPixelWidthStrings.webdings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var font: js.UndefOr[
    (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
  ] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setFont(
      value: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
    ): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
