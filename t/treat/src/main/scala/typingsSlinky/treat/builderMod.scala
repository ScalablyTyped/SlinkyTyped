package typingsSlinky.treat

import typingsSlinky.treat.typesMod.ClassRef
import typingsSlinky.treat.typesMod.GlobalStyle
import typingsSlinky.treat.typesMod.Style
import typingsSlinky.treat.typesMod.StyleMap
import typingsSlinky.treat.typesMod.StylesMap
import typingsSlinky.treat.typesMod.ThemeRef
import typingsSlinky.treat.typesMod.ThemedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("treat/lib/types/builder", JSImport.Namespace)
@js.native
object builderMod extends js.Object {
  
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
  
  type MakeStyleTree[ReturnType] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ /* theme */ js.Any, 
    /* styleNode */ js.Function2[/* style */ Style, /* localDebugName */ js.UndefOr[String], ClassRef], 
    ReturnType
  ]
  
  type StyleMapParam[StyleName /* <: String | Double */] = ThemedStyle[
    StyleMap[StyleName, Style], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ]
}
