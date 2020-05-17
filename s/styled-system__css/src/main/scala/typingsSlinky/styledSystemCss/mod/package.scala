package typingsSlinky.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Omit exists in TypeScript >= v3.5, we're putting this here so typings can be
    * used with earlier versions of TypeScript.
    */
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type StandardCSSProperties = typingsSlinky.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
}
