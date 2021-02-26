package typingsSlinky.styledSystemCss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default(): typingsSlinky.styledSystemCss.mod.CssFunctionReturnType = typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typingsSlinky.styledSystemCss.mod.CssFunctionReturnType]
  @scala.inline
  def default(input: typingsSlinky.styledSystemCss.mod.SystemStyleObject): typingsSlinky.styledSystemCss.mod.CssFunctionReturnType = typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.styledSystemCss.mod.CssFunctionReturnType]
  
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
  
  @scala.inline
  def css(): typingsSlinky.styledSystemCss.mod.CssFunctionReturnType = typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[typingsSlinky.styledSystemCss.mod.CssFunctionReturnType]
  @scala.inline
  def css(input: typingsSlinky.styledSystemCss.mod.SystemStyleObject): typingsSlinky.styledSystemCss.mod.CssFunctionReturnType = typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("css")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.styledSystemCss.mod.CssFunctionReturnType]
  
  @scala.inline
  def get(`object`: js.Object, key: java.lang.String): js.Any = (typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get(`object`: js.Object, key: java.lang.String, defaultValue: js.Any): js.Any = (typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get(`object`: js.Object, key: js.Array[java.lang.String]): js.Any = (typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get(`object`: js.Object, key: js.Array[java.lang.String], defaultValue: js.Any): js.Any = (typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[_]] = typingsSlinky.styledSystemCss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("responsive")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* theme */ js.Object, js.Array[_]]]
}
