package typingsSlinky.xmldsigjs.buildTypesSignedUnderscoreXmlMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.EcdsaParams
import org.scalajs.dom.crypto.RsaPssParams
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.xmlDashCore.xmlDashCoreMod.AssocArray
import typingsSlinky.xmlDashCore.xmlDashCoreMod.IXmlSerializable
import typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlObject
import typingsSlinky.xmldsigjs.buildTypesXmlMod.Reference
import typingsSlinky.xmldsigjs.buildTypesXmlMod.Signature
import typingsSlinky.xmldsigjs.buildTypesXmlMod.Transform
import typingsSlinky.xmldsigjs.buildTypesXmlMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/signed_xml", "SignedXml")
@js.native
/**
  * Creates an instance of SignedXml.
  *
  * @param {(Document | Element)} [node]
  *
  * @memberOf SignedXml
  */
class SignedXml () extends IXmlSerializable {
  def this(node: Document) = this()
  def this(node: Element) = this()
  var Algorithm: js.UndefOr[org.scalajs.dom.crypto.Algorithm | RsaPssParams | EcdsaParams] = js.native
  var Key: js.UndefOr[CryptoKey] = js.native
  var Parent: js.UndefOr[Element | XmlObject] = js.native
  var document: js.UndefOr[Document] = js.native
  var signature: Signature = js.native
  /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey): js.Promise[Unit] = js.native
  /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsSign): js.Promise[Unit] = js.native
  /* protected */ def ApplyTransforms(transforms: Transforms, input: Element): js.Any = js.native
  /**
    * Copies namespaces from source element and its parents into destination element
    */
  /* protected */ def CopyNamespaces(src: Element, dst: Element, ignoreDefault: Boolean): Unit = js.native
  /* protected */ def DigestReference(doc: Element, reference: Reference, checkHmac: Boolean): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  /* protected */ def DigestReferences(data: Element): js.Promise[Unit] = js.native
  /**
    * Returns the public key of a signature.
    */
  /* protected */ def GetPublicKeys(): js.Promise[js.Array[CryptoKey]] = js.native
  /**
    * Returns dictionary of namespaces used in signature
    */
  /* protected */ def GetSignatureNamespaces(): AssocArray[String] = js.native
  /**
    * Injects namespaces from dictionary to the target element
    */
  /* protected */ def InjectNamespaces(namespaces: StringDictionary[String], target: Element, ignoreDefault: Boolean): Unit = js.native
  /**
    * Loads a SignedXml state from an XML element.
    * @param  {Element | string} value The XML to load the SignedXml state from.
    * @returns void
    */
  def LoadXml(value: Element): Unit = js.native
  /* protected */ def ResolveTransform(transform: String): Transform = js.native
  def Sign(algorithm: typingsSlinky.std.Algorithm, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
  def Sign(algorithm: typingsSlinky.std.Algorithm, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
  def Sign(algorithm: typingsSlinky.std.EcdsaParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
  def Sign(algorithm: typingsSlinky.std.EcdsaParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
  def Sign(algorithm: typingsSlinky.std.RsaPssParams, key: CryptoKey, data: Document): js.Promise[Signature] = js.native
  def Sign(algorithm: typingsSlinky.std.RsaPssParams, key: CryptoKey, data: Document, options: OptionsSign): js.Promise[Signature] = js.native
  def Signature(): scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  /* protected */ def TransformSignedInfo(): String = js.native
  /* protected */ def TransformSignedInfo(data: typingsSlinky.std.Document): String = js.native
  /* protected */ def TransformSignedInfo(data: typingsSlinky.std.Element): String = js.native
  /* protected */ def ValidateReferences(doc: Element): js.Promise[Boolean] = js.native
  /* protected */ def ValidateSignatureValue(keys: js.Array[CryptoKey]): js.Promise[Boolean] = js.native
  def Verify(): js.Promise[Boolean] = js.native
  def Verify(key: CryptoKey): js.Promise[Boolean] = js.native
  def XmlSignature(): Signature = js.native
}

