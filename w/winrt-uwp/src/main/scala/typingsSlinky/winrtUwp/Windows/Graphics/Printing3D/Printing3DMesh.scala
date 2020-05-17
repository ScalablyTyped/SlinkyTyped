package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mesh in the 3D model. */
@js.native
trait Printing3DMesh extends js.Object {
  /** Gets a set of mesh buffer descriptions. */
  var bufferDescriptionSet: IPropertySet = js.native
  /** Gets a set of mesh buffers. */
  var bufferSet: IPropertySet = js.native
  /** Gets or sets the number of triangle indices. */
  var indexCount: Double = js.native
  /** Gets or sets the buffer description for triangle indices. */
  var triangleIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for triangle material indices. */
  var triangleMaterialIndicesDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the number of triangle vertices. */
  var vertexCount: Double = js.native
  /** Gets or sets the buffer description for vertex normals. */
  var vertexNormalsDescription: Printing3DBufferDescription = js.native
  /** Gets or sets the buffer description for vertex positions. */
  var vertexPositionsDescription: Printing3DBufferDescription = js.native
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
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult] = js.native
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
  implicit class Printing3DMeshOps[Self <: Printing3DMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferDescriptionSet(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferDescriptionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSet(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTriangleIndices(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTriangleIndices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateTriangleMaterialIndices(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTriangleMaterialIndices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateVertexNormals(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVertexNormals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateVertexPositions(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVertexPositions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTriangleIndices(value: () => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriangleIndices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTriangleMaterialIndices(value: () => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriangleMaterialIndices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVertexNormals(value: () => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertexNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVertexPositions(value: () => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertexPositions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndexCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleIndicesDescription(value: Printing3DBufferDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleIndicesDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangleMaterialIndicesDescription(value: Printing3DBufferDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleMaterialIndicesDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifyAsync(
      value: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVertexCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexNormalsDescription(value: Printing3DBufferDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexNormalsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPositionsDescription(value: Printing3DBufferDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPositionsDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

