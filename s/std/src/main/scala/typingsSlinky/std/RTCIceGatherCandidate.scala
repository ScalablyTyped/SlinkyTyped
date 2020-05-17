package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RTCIceCandidateDictionary
  - typingsSlinky.std.RTCIceCandidateComplete
*/
trait RTCIceGatherCandidate extends js.Object

object RTCIceGatherCandidate {
  @scala.inline
  implicit def apply(value: RTCIceCandidateComplete): RTCIceGatherCandidate = value.asInstanceOf[RTCIceGatherCandidate]
  @scala.inline
  implicit def apply(value: RTCIceCandidateDictionary): RTCIceGatherCandidate = value.asInstanceOf[RTCIceGatherCandidate]
}

