package typingsSlinky.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortMode extends StObject
@JSImport("xelib", "SortMode")
@js.native
object SortMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortMode with Double] = js.native
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and record are sorted by their EditorID.
    */
  @js.native
  sealed trait EditorID extends SortMode
  /* 2 */ val EditorID: typingsSlinky.xelib.mod.SortMode.EditorID with Double = js.native
  
  /**
    * Files are sorted by load order,
    * groups are sorted by signature,
    * and records are sorted by FormID
    */
  @js.native
  sealed trait FormID extends SortMode
  /* 1 */ val FormID: typingsSlinky.xelib.mod.SortMode.FormID with Double = js.native
  
  /**
    * Files are sorted by filename,
    * groups are sorted by display name,
    * and records are sorted by their FULL name.
    */
  @js.native
  sealed trait Name extends SortMode
  /* 3 */ val Name: typingsSlinky.xelib.mod.SortMode.Name with Double = js.native
  
  /**
    * No sorting.
    * Elements will be in native order corresponding to the order in which they were found in the plugin file they were loaded from.
    */
  @js.native
  sealed trait None extends SortMode
  /* 0 */ val None: typingsSlinky.xelib.mod.SortMode.None with Double = js.native
}
