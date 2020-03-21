package typingsSlinky.universalCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChangeListenerCallback = js.Function3[
    /* name */ java.lang.String, 
    /* value */ java.lang.String | js.Object, 
    /* options */ typingsSlinky.universalCookie.mod.CookieOpts, 
    scala.Unit
  ]
  type CookiesByName = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
