package typingsSlinky.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AnimationUtils")
@js.native
object AnimationUtils extends js.Object {
  
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
  
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
  
  def isTypedArray(`object`: js.Any): Boolean = js.native
  
  def makeClipAdditive(targetClip: typingsSlinky.three.animationClipMod.AnimationClip): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: typingsSlinky.three.animationClipMod.AnimationClip
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: typingsSlinky.three.animationClipMod.AnimationClip,
    fps: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(targetClip: typingsSlinky.three.animationClipMod.AnimationClip, referenceFrame: Double): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typingsSlinky.three.animationClipMod.AnimationClip
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typingsSlinky.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typingsSlinky.three.animationClipMod.AnimationClip,
    fps: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
  
  def subclip(
    sourceClip: typingsSlinky.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  def subclip(
    sourceClip: typingsSlinky.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double,
    fps: Double
  ): typingsSlinky.three.animationClipMod.AnimationClip = js.native
}
