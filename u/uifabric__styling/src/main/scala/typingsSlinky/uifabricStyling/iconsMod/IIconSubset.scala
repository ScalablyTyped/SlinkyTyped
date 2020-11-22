package typingsSlinky.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.uifabricMergeStyles.irawstyleMod.IRawStyle
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IFontFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIconSubset extends js.Object {
  
  var fontFace: js.UndefOr[IFontFace] = js.native
  
  var icons: StringDictionary[String | ReactElement] = js.native
  
  var style: js.UndefOr[IRawStyle] = js.native
}
object IIconSubset {
  
  @scala.inline
  def apply(icons: StringDictionary[String | ReactElement]): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubset]
  }
  
  @scala.inline
  implicit class IIconSubsetOps[Self <: IIconSubset] (val x: Self) extends AnyVal {
    
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
    def setIcons(value: StringDictionary[String | ReactElement]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFace(value: IFontFace): Self = this.set("fontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFace: Self = this.set("fontFace", js.undefined)
    
    @scala.inline
    def setStyle(value: IRawStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
