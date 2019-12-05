package typingsSlinky.twoDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twoDotJsMod {
  import typingsSlinky.std.Record
  import typingsSlinky.twoDotJs.twoDotJsStrings.bottom
  import typingsSlinky.twoDotJs.twoDotJsStrings.height
  import typingsSlinky.twoDotJs.twoDotJsStrings.left
  import typingsSlinky.twoDotJs.twoDotJsStrings.right
  import typingsSlinky.twoDotJs.twoDotJsStrings.top
  import typingsSlinky.twoDotJs.twoDotJsStrings.width

  type BoundingClientRect = Record[top | left | right | bottom | width | height, Double]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.twoDotJs.twoDotJsMod.LinearGradient
    - typings.twoDotJs.twoDotJsMod.RadialGradient
  */
  type Color = _Color | String
  type _Object = Object
}
