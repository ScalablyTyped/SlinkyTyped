package typingsSlinky.sdp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SDPBlob = java.lang.String
  
  type SDPCodecAdditionalParameters = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SDPLine = java.lang.String
  
  type SDPSection = java.lang.String
  
  @scala.inline
  def generateIdentifier(): java.lang.String = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateIdentifier")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def generateSessionId(): java.lang.String = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSessionId")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def getDescription(blob: typingsSlinky.sdp.mod.SDPBlob): typingsSlinky.sdp.mod.SDPSection = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDescription")(blob.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPSection]
  
  @scala.inline
  def getDirection(mediaSection: typingsSlinky.sdp.mod.SDPSection, sessionpart: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPDirection = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(mediaSection.asInstanceOf[js.Any], sessionpart.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPDirection]
  
  @scala.inline
  def getDtlsParameters(mediaSection: typingsSlinky.sdp.mod.SDPSection, session: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPDtlsParameters = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDtlsParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPDtlsParameters]
  
  @scala.inline
  def getIceParameters(mediaSection: typingsSlinky.sdp.mod.SDPSection, session: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPIceParameters = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getIceParameters")(mediaSection.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPIceParameters]
  
  @scala.inline
  def getKind(mediaSection: typingsSlinky.sdp.mod.SDPSection): java.lang.String = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getKind")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getMediaSections(blob: typingsSlinky.sdp.mod.SDPBlob): js.Array[typingsSlinky.sdp.mod.SDPSection] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMediaSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPSection]]
  
  @scala.inline
  def getMid(mediaSection: typingsSlinky.sdp.mod.SDPSection): java.lang.String = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def isRejected(mediaSection: typingsSlinky.sdp.mod.SDPSection): scala.Boolean = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidSDP(blob: typingsSlinky.sdp.mod.SDPBlob): scala.Boolean = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidSDP")(blob.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def localCname: java.lang.String = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("localCname").asInstanceOf[java.lang.String]
  
  @scala.inline
  def matchPrefix(blob: typingsSlinky.sdp.mod.SDPBlob, prefix: java.lang.String): js.Array[typingsSlinky.sdp.mod.SDPLine] = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPrefix")(blob.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPLine]]
  
  @scala.inline
  def parseCandidate(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPIceCandidate = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseCandidate")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPIceCandidate]
  
  @scala.inline
  def parseExtmap(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPHeaderExtension = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseExtmap")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPHeaderExtension]
  
  @scala.inline
  def parseFingerprint(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPFingerprint = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPFingerprint]
  
  @scala.inline
  def parseFmtp(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPCodecAdditionalParameters = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFmtp")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPCodecAdditionalParameters]
  
  @scala.inline
  def parseIceOptions(line: typingsSlinky.sdp.mod.SDPLine): js.Array[java.lang.String] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseIceOptions")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def parseMLine(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPMLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseMLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPMLine]
  
  @scala.inline
  def parseMsid(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPMediaStreamId = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseMsid")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPMediaStreamId]
  
  @scala.inline
  def parseOLine(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPOLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseOLine")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPOLine]
  
  @scala.inline
  def parseRtcpFb(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPFeedbackParameter = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpFb")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPFeedbackParameter]
  
  @scala.inline
  def parseRtcpParameters(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPRtcpParameters = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtcpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPRtcpParameters]
  
  @scala.inline
  def parseRtpEncodingParameters(mediaSection: typingsSlinky.sdp.mod.SDPSection): js.Array[typingsSlinky.sdp.mod.SDPEncodingParameters] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpEncodingParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPEncodingParameters]]
  
  @scala.inline
  def parseRtpMap(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPCodecParameters = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpMap")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPCodecParameters]
  
  @scala.inline
  def parseRtpParameters(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPRtpCapabilities = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpParameters")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPRtpCapabilities]
  
  @scala.inline
  def parseSctpDescription(mediaSection: typingsSlinky.sdp.mod.SDPSection): typingsSlinky.sdp.mod.SDPSctpDescription = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSctpDescription")(mediaSection.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPSctpDescription]
  
  @scala.inline
  def parseSsrcGroup(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPMediaSourceGroup = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcGroup")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPMediaSourceGroup]
  
  @scala.inline
  def parseSsrcMedia(line: typingsSlinky.sdp.mod.SDPLine): typingsSlinky.sdp.mod.SDPMediaSource = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSsrcMedia")(line.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPMediaSource]
  
  @scala.inline
  def splitLines(blob: typingsSlinky.sdp.mod.SDPBlob): js.Array[typingsSlinky.sdp.mod.SDPLine] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitLines")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPLine]]
  
  @scala.inline
  def splitSections(blob: typingsSlinky.sdp.mod.SDPBlob): js.Array[typingsSlinky.sdp.mod.SDPSection] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitSections")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPSection]]
  
  @scala.inline
  def writeCandidate(candidate: typingsSlinky.sdp.mod.SDPIceCandidate): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeCandidate")(candidate.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeDtlsParameters(params: typingsSlinky.sdp.mod.SDPDtlsParameters, setupType: java.lang.String): typingsSlinky.sdp.mod.SDPLine = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeDtlsParameters")(params.asInstanceOf[js.Any], setupType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeExtmap(headerExtension: typingsSlinky.sdp.mod.SDPHeaderExtension): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeExtmap")(headerExtension.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeFmtp(codec: typingsSlinky.sdp.mod.SDPCodec): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFmtp")(codec.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeIceParameters(params: typingsSlinky.sdp.mod.SDPIceParameters): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeIceParameters")(params.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeRtcpFb(codec: typingsSlinky.sdp.mod.SDPCodec): js.Array[typingsSlinky.sdp.mod.SDPLine] = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpFb")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.sdp.mod.SDPLine]]
  
  @scala.inline
  def writeRtcpParameters(params: typingsSlinky.sdp.mod.SDPRtcpParameters): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtcpParameters")(params.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeRtpDescription(kind: java.lang.String, caps: typingsSlinky.sdp.mod.SDPRtpCapabilities): typingsSlinky.sdp.mod.SDPSection = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpDescription")(kind.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPSection]
  
  @scala.inline
  def writeRtpMap(codec: typingsSlinky.sdp.mod.SDPCodecParameters): typingsSlinky.sdp.mod.SDPLine = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeRtpMap")(codec.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPLine]
  
  @scala.inline
  def writeSctpDescription(mediaSection: typingsSlinky.sdp.mod.SDPMLine, desc: typingsSlinky.sdp.mod.SDPSctpDescription): typingsSlinky.sdp.mod.SDPSection = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSctpDescription")(mediaSection.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPSection]
  
  @scala.inline
  def writeSessionBoilerplate(): typingsSlinky.sdp.mod.SDPBlob = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")().asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: js.UndefOr[scala.Nothing], sessVer: js.UndefOr[scala.Nothing], sessUser: java.lang.String): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: js.UndefOr[scala.Nothing], sessVer: scala.Double): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: js.UndefOr[scala.Nothing], sessVer: scala.Double, sessUser: java.lang.String): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: java.lang.String): typingsSlinky.sdp.mod.SDPBlob = typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: java.lang.String, sessVer: js.UndefOr[scala.Nothing], sessUser: java.lang.String): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: java.lang.String, sessVer: scala.Double): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
  @scala.inline
  def writeSessionBoilerplate(sessId: java.lang.String, sessVer: scala.Double, sessUser: java.lang.String): typingsSlinky.sdp.mod.SDPBlob = (typingsSlinky.sdp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSessionBoilerplate")(sessId.asInstanceOf[js.Any], sessVer.asInstanceOf[js.Any], sessUser.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.sdp.mod.SDPBlob]
}
