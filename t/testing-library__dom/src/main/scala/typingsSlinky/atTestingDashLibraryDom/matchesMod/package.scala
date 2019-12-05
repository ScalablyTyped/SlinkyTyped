package typingsSlinky.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchesMod {
  import org.scalajs.dom.raw.HTMLElement

  type Match = js.Function4[
    /* textToMatch */ String, 
    /* node */ HTMLElement | Null, 
    /* matcher */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    Boolean
  ]
  type Matcher = String | js.RegExp | MatcherFunction
  type MatcherFunction = js.Function2[/* content */ String, /* element */ HTMLElement, Boolean]
  type NormalizerFn = js.Function1[/* text */ String, String]
}
