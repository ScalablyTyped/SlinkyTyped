package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mesh in the 3D model. */
@js.native
trait Printing3DMesh extends StObject {
  
  /** Gets a set of mesh buffer descriptions. */
  var bufferDescriptionSet: IPropertySet = js.native
  
  /** Gets a set of mesh buffers. */
  var bufferSet: IPropertySet = js.native
  
  /**
    * Creates the buffer for triangle indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleIndices(value: Double): Unit = js.native
  
  /**
    * Creates the buffer for triangle material indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleMaterialIndices(value: Double): Unit = js.native
  
  /**
    * Creates the buffer for vertex normals.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexNormals(value: Double): Unit = js.native
  
  /**
    * Creates the buffer for vertex positions.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexPositions(value: Double): Unit = js.native
  
  /**
    * Gets the buffer for triangle indices.
    * @return The buffer for triangle indices.
    */
  def getTriangleIndices(): IBuffer = js.native
  
  /**
    * Gets the buffer for triangle material indices.
    * @return The buffer for triangle material indices.
    */
  def getTriangleMaterialIndices(): IBuffer = js.native
  
  /**
    * Gets the buffer for vertex normals.
    * @return The buffer for vertex normals.
    */
  def getVertexNormals(): IBuffer = js.native
  
  /**
    * Gets the buffer for vertex positions.
    * @return The buffer for vertex positions.
    */
  def getVertexPositions(): IBuffer = js.native
  
  /** Gets or sets the number of triangle indices. */
  var indexCount: Double = js.native
  
  /** Gets or sets the buffer description for triangle indices. */
  var triangleIndicesDescription: Printing3DBufferDescription = js.native
  
  /** Gets or sets the buffer description for triangle material indices. */
  var triangleMaterialIndicesDescription: Printing3DBufferDescription = js.native
  
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult] = js.native
  
  /** Gets or sets the number of triangle vertices. */
  var vertexCount: Double = js.native
  
  /** Gets or sets the buffer description for vertex normals. */
  var vertexNormalsDescription: Printing3DBufferDescription = js.native
  
  /** Gets or sets the buffer description for vertex positions. */
  var vertexPositionsDescription: Printing3DBufferDescription = js.native
}
object Printing3DMesh {
  
  @scala.inline
  def apply(
    bufferDescriptionSet: IPropertySet,
    bufferSet: IPropertySet,
    createTriangleIndices: Double => Unit,
    createTriangleMaterialIndices: Double => Unit,
    createVertexNormals: Double => Unit,
    createVertexPositions: Double => Unit,
    getTriangleIndices: () => IBuffer,
    getTriangleMaterialIndices: () => IBuffer,
    getVertexNormals: () => IBuffer,
    getVertexPositions: () => IBuffer,
    indexCount: Double,
    triangleIndicesDescription: Printing3DBufferDescription,
    triangleMaterialIndicesDescription: Printing3DBufferDescription,
    verifyAsync: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult],
    vertexCount: Double,
    vertexNormalsDescription: Printing3DBufferDescription,
    vertexPositionsDescription: Printing3DBufferDescription
  ): Printing3DMesh = {
    val __obj = js.Dynamic.literal(bufferDescriptionSet = bufferDescriptionSet.asInstanceOf[js.Any], bufferSet = bufferSet.asInstanceOf[js.Any], createTriangleIndices = js.Any.fromFunction1(createTriangleIndices), createTriangleMaterialIndices = js.Any.fromFunction1(createTriangleMaterialIndices), createVertexNormals = js.Any.fromFunction1(createVertexNormals), createVertexPositions = js.Any.fromFunction1(createVertexPositions), getTriangleIndices = js.Any.fromFunction0(getTriangleIndices), getTriangleMaterialIndices = js.Any.fromFunction0(getTriangleMaterialIndices), getVertexNormals = js.Any.fromFunction0(getVertexNormals), getVertexPositions = js.Any.fromFunction0(getVertexPositions), indexCount = indexCount.asInstanceOf[js.Any], triangleIndicesDescription = triangleIndicesDescription.asInstanceOf[js.Any], triangleMaterialIndicesDescription = triangleMaterialIndicesDescription.asInstanceOf[js.Any], verifyAsync = js.Any.fromFunction1(verifyAsync), vertexCount = vertexCount.asInstanceOf[js.Any], vertexNormalsDescription = vertexNormalsDescription.asInstanceOf[js.Any], vertexPositionsDescription = vertexPositionsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMesh]
  }
  
  @scala.inline
  implicit class Printing3DMeshMutableBuilder[Self <: Printing3DMesh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferDescriptionSet(value: IPropertySet): Self = StObject.set(x, "bufferDescriptionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSet(value: IPropertySet): Self = StObject.set(x, "bufferSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTriangleIndices(value: Double => Unit): Self = StObject.set(x, "createTriangleIndices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTriangleMaterialIndices(value: Double => Unit): Self = StObject.set(x, "createTriangleMaterialIndices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVertexNormals(value: Double => Unit): Self = StObject.set(x, "createVertexNormals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVertexPositions(value: Double => Unit): Self = StObject.set(x, "createVertexPositions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTriangleIndices(value: () => IBuffer): Self = StObject.set(x, "getTriangleIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriangleMaterialIndices(value: () => IBuffer): Self = StObject.set(x, "getTriangleMaterialIndices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertexNormals(value: () => IBuffer): Self = StObject.set(x, "getVertexNormals", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertexPositions(value: () => IBuffer): Self = StObject.set(x, "getVertexPositions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleIndicesDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "triangleIndicesDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleMaterialIndicesDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "triangleMaterialIndicesDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyAsync(
      value: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult]
    ): Self = StObject.set(x, "verifyAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexNormalsDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "vertexNormalsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexPositionsDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "vertexPositionsDescription", value.asInstanceOf[js.Any])
  }
}
