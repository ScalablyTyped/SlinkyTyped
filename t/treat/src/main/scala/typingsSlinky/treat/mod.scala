package typingsSlinky.treat

import typingsSlinky.treat.builderMod.MakeStyleTree
import typingsSlinky.treat.builderMod.StyleMapParam
import typingsSlinky.treat.typesMod.ClassRef
import typingsSlinky.treat.typesMod.GlobalStyle
import typingsSlinky.treat.typesMod.Style
import typingsSlinky.treat.typesMod.StylesMap
import typingsSlinky.treat.typesMod.ThemeRef
import typingsSlinky.treat.typesMod.ThemedStyle
import typingsSlinky.treat.typesMod.TreatModuleObject
import typingsSlinky.treat.typesMod.TreatModuleValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("treat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ): ThemeRef = js.native
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any,
    localDebugName: String
  ): ThemeRef = js.native
  
  def globalStyle(
    selector: String,
    style: ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): Unit = js.native
  
  def resolveClassName(themeRef: String, classRef: String): String = js.native
  
  def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = js.native
  def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = js.native
  
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): ClassRef = js.native
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ],
    localDebugName: String
  ): ClassRef = js.native
  
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = js.native
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = js.native
  
  def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = js.native
}
