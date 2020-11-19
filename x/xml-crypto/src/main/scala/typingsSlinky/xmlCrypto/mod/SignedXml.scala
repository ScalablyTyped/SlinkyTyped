package typingsSlinky.xmlCrypto.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.node.Buffer
import typingsSlinky.xmlCrypto.anon.Attrs
import typingsSlinky.xmlCrypto.anon.CanonicalizationAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-crypto", "SignedXml")
@js.native
class SignedXml () extends js.Object {
  def this(idMode: String) = this()
  def this(idMode: js.UndefOr[scala.Nothing], options: CanonicalizationAlgorithm) = this()
  def this(idMode: String, options: CanonicalizationAlgorithm) = this()
  def this(idMode: Null, options: CanonicalizationAlgorithm) = this()
  
  def addReference(
    xpath: String,
    transforms: js.UndefOr[js.Array[String]],
    digestAlgorithm: js.UndefOr[String],
    uri: js.UndefOr[String],
    digestValue: js.UndefOr[String],
    inclusiveNamespacesPrefixList: js.UndefOr[String],
    isEmptyUri: js.UndefOr[Boolean]
  ): Unit = js.native
  
  var canonicalizationAlgorithm: String = js.native
  
  def checkSignature(xml: String): Boolean = js.native
  
  def computeSignature(xml: String): Unit = js.native
  def computeSignature(xml: String, opts: Attrs): Unit = js.native
  
  def getOriginalXmlWithIds(): String = js.native
  
  def getSignatureXml(): String = js.native
  
  def getSignedXml(): String = js.native
  
  var keyInfoProvider: FileKeyInfo = js.native
  
  def loadSignature(signatureNode: String): Unit = js.native
  def loadSignature(signatureNode: Node): Unit = js.native
  
  var references: js.Array[Reference] = js.native
  
  var signatureAlgorithm: String = js.native
  
  var signingKey: Buffer | String = js.native
  
  var validationErrors: js.Array[String] = js.native
}
/* static members */
@JSImport("xml-crypto", "SignedXml")
@js.native
object SignedXml extends js.Object {
  
  var CanonicalizationAlgorithms: StringDictionary[Instantiable0[TransformationAlgorithm]] = js.native
  
  var HashAlgorithms: StringDictionary[Instantiable0[HashAlgorithm]] = js.native
  
  var SignatureAlgorithms: StringDictionary[Instantiable0[SignatureAlgorithm]] = js.native
}
