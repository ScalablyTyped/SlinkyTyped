package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object matchesMod {
  
  type ByRoleMatcher = typingsSlinky.ariaQuery.mod.ARIARole | typingsSlinky.testingLibraryDom.matchesMod.MatcherFunction | js.Object
  
  type Match = js.Function4[
    /* textToMatch */ java.lang.String, 
    /* node */ org.scalajs.dom.raw.HTMLElement | scala.Null, 
    /* matcher */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    scala.Boolean
  ]
  
  type Matcher = typingsSlinky.testingLibraryDom.matchesMod.MatcherFunction | js.Object
  
  type MatcherFunction = js.Function2[
    /* content */ java.lang.String, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Boolean
  ]
  
  type NormalizerFn = js.Function1[/* text */ java.lang.String, java.lang.String]
}
