package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an array of matched values if any.
  */
@js.native
trait MatchArray
  extends RegExpMatchArray
     with /**
  * Named capture groups are accessible as properties when the `namespacing`
  * feature is not installed.
  */
/* propName */ StringDictionary[js.Any] {
  
  /**
    * This is only present if the the `namespacing` feature is installed
    * using the `XRegExp.install` method.
    */
  @JSName("groups")
  var groups_MatchArray: js.UndefOr[NamedGroupsArray] = js.native
}
