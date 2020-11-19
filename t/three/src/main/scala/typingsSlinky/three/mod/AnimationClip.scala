package typingsSlinky.three.mod

import typingsSlinky.three.geometryMod.MorphTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends typingsSlinky.three.animationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], duration: Double) = this()
  def this(name: String, duration: Double) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsSlinky.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typingsSlinky.three.constantsMod.AnimationBlendMode
  ) = this()
}
/* static members */
@JSImport("three", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsSlinky.three.animationClipMod.AnimationClip] = js.native
  
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def findByName(clipArray: js.Array[typingsSlinky.three.animationClipMod.AnimationClip], name: String): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def parse(json: js.Any): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def parseAnimation(animation: js.Any, bones: js.Array[typingsSlinky.three.boneMod.Bone]): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def toJSON(): js.Any = js.native
}
