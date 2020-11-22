package typingsSlinky.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.three.boneMod.Bone
import typingsSlinky.three.geometryMod.MorphTarget
import typingsSlinky.three.mod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationClip extends Instantiable0[AnimationClip] {
  
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsSlinky.three.animationClipMod.AnimationClip] = js.native
  
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def findByName(clipArray: js.Array[typingsSlinky.three.animationClipMod.AnimationClip], name: String): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def parse(json: js.Any): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def parseAnimation(animation: js.Any, bones: js.Array[Bone]): typingsSlinky.three.animationClipMod.AnimationClip = js.native
  
  def toJSON(clip: typingsSlinky.three.animationClipMod.AnimationClip): js.Any = js.native
}
