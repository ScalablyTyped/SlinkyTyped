package typingsSlinky.three.webXRMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.three.anon.DetectedPlanes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRFrame extends StObject {
  
  def createAnchor(pose: XRRigidTransform, space: EventTarget): js.Promise[XRAnchor] = js.native
  
  // AR
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  def getJointPose(joint: EventTarget, baseSpace: EventTarget): XRJointPose = js.native
  
  def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  val session: XRSession = js.native
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
  
  // Planes
  var worldInformation: DetectedPlanes = js.native
}
object XRFrame {
  
  @scala.inline
  def apply(
    createAnchor: (XRRigidTransform, EventTarget) => js.Promise[XRAnchor],
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getJointPose: (EventTarget, EventTarget) => XRJointPose,
    getPose: (EventTarget, EventTarget) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession,
    worldInformation: DetectedPlanes
  ): XRFrame = {
    val __obj = js.Dynamic.literal(createAnchor = js.Any.fromFunction2(createAnchor), getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getJointPose = js.Any.fromFunction2(getJointPose), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any], worldInformation = worldInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  @scala.inline
  implicit class XRFrameMutableBuilder[Self <: XRFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAnchor(value: (XRRigidTransform, EventTarget) => js.Promise[XRAnchor]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointPose(value: (EventTarget, EventTarget) => XRJointPose): Self = StObject.set(x, "getJointPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPose(value: (EventTarget, EventTarget) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
  }
}
