package typingsSlinky.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CSSClassNames[K /* <: java.lang.String */] = typingsSlinky.std.Record[K, java.lang.String]
  
  type CSSClasses[K /* <: java.lang.String */] = typingsSlinky.std.Record[K, typingsSlinky.typestyle.typesMod.NestedCSSProperties]
  
  type FontFace = typingsSlinky.csstype.mod.FontFace
  
  type TLength = scala.Double | java.lang.String
}
