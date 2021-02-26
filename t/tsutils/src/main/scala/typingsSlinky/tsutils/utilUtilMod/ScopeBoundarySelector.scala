package typingsSlinky.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScopeBoundarySelector extends StObject
@JSImport("tsutils/util/util", "ScopeBoundarySelector")
@js.native
object ScopeBoundarySelector extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundarySelector with Double] = js.native
  
  @js.native
  sealed trait Block extends ScopeBoundarySelector
  /* 3 */ val Block: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Block with Double = js.native
  
  @js.native
  sealed trait Function extends ScopeBoundarySelector
  /* 1 */ val Function: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Function with Double = js.native
  
  @js.native
  sealed trait InferType extends ScopeBoundarySelector
  /* 8 */ val InferType: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.InferType with Double = js.native
  
  @js.native
  sealed trait Type extends ScopeBoundarySelector
  /* 7 */ val Type: typingsSlinky.tsutils.utilUtilMod.ScopeBoundarySelector.Type with Double = js.native
}
