package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A matched substring, including named capture groups as properties, or the `groups` property
  * if the `namespacing` feature is installed.
  */
@js.native
trait MatchSubString
  extends String
     with /**
  * Named capture groups are accessible as properties when the `namespacing`
  * feature is not installed.
  */
/* propName */ StringDictionary[js.Any] {
  
  /**
    * This is only present if the the `namespacing` feature is installed
    * using the `XRegExp.install` method.
    */
  var groups: js.UndefOr[NamedGroupsArray] = js.native
}
