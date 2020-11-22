package typingsSlinky.treat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type BasicCSSProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  
  type CSSKeyframes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.treat.typesMod.BasicCSSProperties]
  
  type CSSPropertiesAndPseudos = typingsSlinky.treat.typesMod.CSSProperties with typingsSlinky.treat.typesMod.PseudoProperties
  
  type ClassRef = java.lang.String
  
  type PostCSS = js.Object
  
  type PseudoProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in treat.treat/lib/types/transformCSS.SimplePseudos[number] ]:? treat.treat/lib/types/types.CSSProperties}
    */ typingsSlinky.treat.treatStrings.PseudoProperties with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SelectorMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.treat.typesMod.CSSProperties]
  
  type Style = typingsSlinky.treat.typesMod.StyleWithSelectors with typingsSlinky.treat.typesMod.MediaQueries[typingsSlinky.treat.typesMod.StyleWithSelectors] with typingsSlinky.treat.typesMod.FeatureQueries[typingsSlinky.treat.typesMod.StyleWithSelectors]
  
  type StyleMap[StyleName /* <: java.lang.String | scala.Double */, StyleType] = typingsSlinky.std.Record[StyleName, StyleType]
  
  type StylesMap[StyleName /* <: java.lang.String | scala.Double */] = typingsSlinky.std.Record[StyleName, typingsSlinky.treat.typesMod.ClassRef]
  
  type ThemeRef = java.lang.String
  
  type ThemedStyle[StyleType, Theme] = (js.Function1[/* theme */ Theme, StyleType]) | StyleType
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.treat.typesMod.TreatModuleObject
    - typingsSlinky.treat.typesMod.TreatModuleArray
  */
  type TreatModuleValue = js.UndefOr[
    typingsSlinky.treat.typesMod._TreatModuleValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
}
