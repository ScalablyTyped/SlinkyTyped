package typingsSlinky.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationData = typingsSlinky.victory.mod.AnimationStyle | js.Array[typingsSlinky.victory.mod.AnimationStyle]
  
  type AnimationStyle = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  
  /**
    * Category prop type
    */
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typingsSlinky.victory.anon.XArray
    - typingsSlinky.victory.anon.YArray
    - typingsSlinky.victory.anon.XArrayYArray
  */
  type CategoryPropType = typingsSlinky.victory.mod._CategoryPropType | js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.victory.victoryStrings.greyscale
    - typingsSlinky.victory.victoryStrings.qualitative
    - typingsSlinky.victory.victoryStrings.heatmap
    - typingsSlinky.victory.victoryStrings.warm
    - typingsSlinky.victory.victoryStrings.cool
    - typingsSlinky.victory.victoryStrings.red
    - typingsSlinky.victory.victoryStrings.green
    - typingsSlinky.victory.victoryStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = typingsSlinky.victory.mod._ColorScalePropType | js.Array[java.lang.String]
  
  /**
    * Data getter property type
    */
  type DataGetterPropType = scala.Double | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* data */ js.Any, scala.Double | java.lang.String | js.Array[java.lang.String]])
  
  /**
    * Domain padding
    */
  type DomainPaddingPropType = scala.Double | typingsSlinky.victory.anon.XY
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.victory.mod.DomainTuple
    - typingsSlinky.victory.anon.X
    - typingsSlinky.victory.anon.Y
  */
  type DomainPropType = typingsSlinky.victory.mod._DomainPropType | typingsSlinky.victory.mod.DomainTuple
  
  /**
    * Data domain type
    */
  type DomainTuple = js.Tuple2[js.Date | scala.Double, js.Date | scala.Double]
  
  type NumberOrCallback = scala.Double | typingsSlinky.victory.mod.VictoryNumberCallback
  
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PaddingProps = scala.Double | typingsSlinky.victory.mod.BlockProps
  
  type SliceNumberOrCallback[T, P] = scala.Double | (js.Function1[/* props */ typingsSlinky.victory.mod.Omit[T, P], scala.Double])
  
  type StringOrNumberOrCallback = java.lang.String | scala.Double | typingsSlinky.victory.mod.VictoryStringOrNumberCallback
  
  type VictoryNumberCallback = js.Function1[/* args */ typingsSlinky.victory.mod.CallbackArgs, scala.Double]
  
  type VictoryStringOrNumberCallback = js.Function1[/* args */ typingsSlinky.victory.mod.CallbackArgs, java.lang.String | scala.Double]
}
