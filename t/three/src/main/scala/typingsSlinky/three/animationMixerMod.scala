package typingsSlinky.three

import typingsSlinky.three.animationActionMod.AnimationAction
import typingsSlinky.three.animationClipMod.AnimationClip
import typingsSlinky.three.animationObjectGroupMod.AnimationObjectGroup
import typingsSlinky.three.constantsMod.AnimationBlendMode
import typingsSlinky.three.eventDispatcherMod.EventDispatcher
import typingsSlinky.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/AnimationMixer", JSImport.Namespace)
@js.native
object animationMixerMod extends js.Object {
  
  @js.native
  class AnimationMixer protected () extends EventDispatcher {
    def this(root: AnimationObjectGroup) = this()
    def this(root: Object3D) = this()
    
    def clipAction(clip: AnimationClip): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: js.UndefOr[scala.Nothing], blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup, blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D, blendMode: AnimationBlendMode): AnimationAction = js.native
    
    def existingAction(clip: AnimationClip): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: Object3D): AnimationAction | Null = js.native
    
    def getRoot(): Object3D | AnimationObjectGroup = js.native
    
    def setTime(timeInSeconds: Double): AnimationMixer = js.native
    
    def stopAllAction(): AnimationMixer = js.native
    
    var time: Double = js.native
    
    var timeScale: Double = js.native
    
    def uncacheAction(clip: AnimationClip): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: AnimationObjectGroup): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: Object3D): Unit = js.native
    
    def uncacheClip(clip: AnimationClip): Unit = js.native
    
    def uncacheRoot(root: AnimationObjectGroup): Unit = js.native
    def uncacheRoot(root: Object3D): Unit = js.native
    
    def update(deltaTime: Double): AnimationMixer = js.native
  }
}
