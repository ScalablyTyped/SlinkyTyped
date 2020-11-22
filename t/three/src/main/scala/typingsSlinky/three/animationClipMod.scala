package typingsSlinky.three

import typingsSlinky.three.boneMod.Bone
import typingsSlinky.three.constantsMod.AnimationBlendMode
import typingsSlinky.three.geometryMod.MorphTarget
import typingsSlinky.three.keyframeTrackMod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/AnimationClip", JSImport.Namespace)
@js.native
object animationClipMod extends js.Object {
  
  @js.native
  class AnimationClip () extends js.Object {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], duration: Double) = this()
    def this(name: String, duration: Double) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack]
    ) = this()
    def this(name: js.UndefOr[scala.Nothing], duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: js.UndefOr[scala.Nothing], tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: Double,
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: Double,
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: String,
      duration: js.UndefOr[scala.Nothing],
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: String,
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(name: String, duration: Double, tracks: js.UndefOr[scala.Nothing], blendMode: AnimationBlendMode) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    
    /**
    	 * @default THREE.NormalAnimationBlendMode
    	 */
    var blendMode: AnimationBlendMode = js.native
    
    /**
    	 * @default -1
    	 */
    var duration: Double = js.native
    
    var name: String = js.native
    
    def optimize(): AnimationClip = js.native
    
    def resetDuration(): AnimationClip = js.native
    
    var results: js.Array[_] = js.native
    
    var tracks: js.Array[KeyframeTrack] = js.native
    
    def trim(): AnimationClip = js.native
    
    var uuid: String = js.native
    
    def validate(): Boolean = js.native
  }
  /* static members */
  @js.native
  object AnimationClip extends js.Object {
    
    def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[AnimationClip] = js.native
    
    def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): AnimationClip = js.native
    
    def findByName(clipArray: js.Array[AnimationClip], name: String): AnimationClip = js.native
    
    def parse(json: js.Any): AnimationClip = js.native
    
    def parseAnimation(animation: js.Any, bones: js.Array[Bone]): AnimationClip = js.native
    
    def toJSON(clip: AnimationClip): js.Any = js.native
  }
}
