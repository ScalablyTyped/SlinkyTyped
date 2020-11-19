package typingsSlinky.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Aliases = typingsSlinky.immutable.Immutable.OrderedMap[
    java.lang.String, 
    typingsSlinky.immutable.Immutable.Map[java.lang.String, java.lang.String | scala.Double]
  ]
  
  type FormatResultFn = js.Function1[/* result */ typingsSlinky.theo.mod.ImmutableStyleMap, java.lang.String]
  
  type Meta = typingsSlinky.immutable.Immutable.Map[java.lang.String, java.lang.String]
  
  type Prop = typingsSlinky.immutable.Immutable.Map[typingsSlinky.theo.mod.StyleProperty, java.lang.String | scala.Double]
  
  type Props = typingsSlinky.immutable.Immutable.List[typingsSlinky.theo.mod.Prop]
}
