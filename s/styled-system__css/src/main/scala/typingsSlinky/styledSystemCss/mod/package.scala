package typingsSlinky.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typingsSlinky.styledSystemCss.mod.CSSObject]
  
  type CssFunctionReturnType = js.Function1[
    /* props */ js.UndefOr[
      typingsSlinky.styledSystemCss.mod.Theme | typingsSlinky.styledSystemCss.anon.Theme
    ], 
    typingsSlinky.styledSystemCss.mod.CSSObject
  ]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])
  
  type StandardCSSProperties = typingsSlinky.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styledSystemCss.mod.SystemCssProperties
    - typingsSlinky.styledSystemCss.mod.CSSPseudoSelectorProps
    - typingsSlinky.styledSystemCss.mod.CSSSelectorObject
    - typingsSlinky.styledSystemCss.mod.VariantProperty
    - typingsSlinky.styledSystemCss.mod.UseThemeFunction
    - typingsSlinky.styledSystemCss.mod.EmotionLabel
    - scala.Null
  */
  type SystemStyleObject = typingsSlinky.styledSystemCss.mod._SystemStyleObject | scala.Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styledSystemCss.anon.KinkeyofStandardCSSProper
    - typingsSlinky.styledSystemCss.anon.PartialScaleThemeProperti
    - typingsSlinky.styledSystemCss.mod.ThemeBreakPoints
    - org.scalablytyped.runtime.StringDictionary[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme * / js.Object]
  */
  type Theme = typingsSlinky.styledSystemCss.mod._Theme | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
