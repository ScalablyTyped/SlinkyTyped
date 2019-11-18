package typingsSlinky.three.threeMod

import typingsSlinky.three.srcCoreGeometryMod.MorphTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsSlinky.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
}

/* static members */
@JSImport("three", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip], name: String): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[typingsSlinky.three.srcObjectsBoneMod.Bone], nodeName: String): typingsSlinky.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

