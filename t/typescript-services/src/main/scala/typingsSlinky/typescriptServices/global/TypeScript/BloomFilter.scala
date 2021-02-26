package typingsSlinky.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
}
object BloomFilter {
  
  @JSGlobal("TypeScript.BloomFilter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.BloomFilter.computeK")
  @js.native
  def computeK(expectedCount: Double): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.BloomFilter.computeM")
  @js.native
  def computeM(expectedCount: Double): Double = js.native
  
  /* static member */
  @JSGlobal("TypeScript.BloomFilter.falsePositiveProbability")
  @js.native
  def falsePositiveProbability: Double = js.native
  @scala.inline
  def falsePositiveProbability_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("falsePositiveProbability")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.BloomFilter.isEquivalent")
  @js.native
  def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = js.native
}
