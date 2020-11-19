package typingsSlinky.webgme.Blobs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.JSON
import typingsSlinky.webgme.Core.DataObject
import typingsSlinky.webgme.GmeClasses.Artifact
import typingsSlinky.webgme.GmeCommon.Content
import typingsSlinky.webgme.GmeCommon.ContentString
import typingsSlinky.webgme.GmeCommon.Metadata
import typingsSlinky.webgme.GmeCommon.MetadataHash
import typingsSlinky.webgme.GmeCommon.Name
import typingsSlinky.webgme.GmeCommon.Payload
import typingsSlinky.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobClient extends js.Object {
  
  /**
    * Creates a new artifact 
    * and adds it to array of artifacts of the instance.
    * @param name name of artifact.
    * @return the created artifact.
    */
  def createArtifact(name: Name): Artifact = js.native
  
  /**
    * Retrieves the Artifact from the blob storage.
    * @param metadataHash hash associated with the artifact.
    * @return resolved with Artifact artifact.
    */
  def getArtifact(metadataHash: MetadataHash): js.Promise[Artifact] = js.native
  /**
    * Retrieves the Artifact from the blob storage.
    * @param metadataHash hash associated with the artifact.
    * @return resolved with Artifact artifact.
    */
  def getArtifact(metadataHash: MetadataHash, callback: ResultCallback[Artifact]): Unit = js.native
  
  def getCreateURL(filename: Name, isMetadata: Boolean): String = js.native
  
  def getDownloadURL(metadataHash: MetadataHash, subpath: String): String = js.native
  
  def getHumanSize(bytes: Double, si: Boolean): String = js.native
  
  def getMetadata(metadataHash: MetadataHash): js.Promise[Metadata] = js.native
  def getMetadata(metadataHash: MetadataHash, callback: ResultCallback[Metadata]): Unit = js.native
  
  def getMetadataURL(metadataHash: MetadataHash): String = js.native
  
  def getObject(metadataHash: MetadataHash, callback: ResultCallback[Content], subpath: String): Unit = js.native
  def getObject(metadataHash: MetadataHash, subpath: String): js.Promise[Content] = js.native
  
  def getObjectAsJSON(metadataHash: MetadataHash): js.Promise[JSON] = js.native
  def getObjectAsJSON(metadataHash: MetadataHash, callback: ResultCallback[JSON]): Unit = js.native
  
  def getObjectAsString(metadataHash: MetadataHash): js.Promise[ContentString] = js.native
  def getObjectAsString(metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): ContentString = js.native
  
  def getRelativeCreateURL(filename: Name, isMetadata: Boolean): String = js.native
  
  def getRelativeDownloadURL(metadataHash: MetadataHash, subpath: String): String = js.native
  
  def getRelativeMetadataURL(metadataHash: MetadataHash): String = js.native
  
  def getSubObject(metadataHash: MetadataHash, subpath: String): js.Promise[DataObject] = js.native
  def getSubObject(metadataHash: MetadataHash, subpath: String, callback: ResultCallback[DataObject]): Unit = js.native
  
  def getViewURL(metadataHash: MetadataHash, subpath: String): String = js.native
  
  def putFile(name: Name, data: Payload): js.Promise[MetadataHash] = js.native
  def putFile(name: Name, data: Payload, callback: ResultCallback[MetadataHash]): Unit = js.native
  
  def putFiles(o: StringDictionary[Payload]): js.Promise[js.Array[MetadataHash]] = js.native
  def putFiles(o: StringDictionary[Payload], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  
  def putMetadata(metadataDescriptor: BlobMetadataDescriptor): js.Promise[MetadataHash] = js.native
  def putMetadata(metadataDescriptor: BlobMetadataDescriptor, callback: ResultCallback[MetadataHash]): Unit = js.native
  
  def saveAllArtifacts(): js.Promise[js.Array[MetadataHash]] = js.native
  def saveAllArtifacts(callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}
