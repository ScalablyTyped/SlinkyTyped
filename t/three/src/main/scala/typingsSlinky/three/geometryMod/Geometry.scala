package typingsSlinky.three.geometryMod

import typingsSlinky.three.animationClipMod.AnimationClip
import typingsSlinky.three.boneMod.Bone
import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.eventDispatcherMod.EventDispatcher
import typingsSlinky.three.face3Mod.Face3
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.matrix3Mod.Matrix
import typingsSlinky.three.matrix4Mod.Matrix4
import typingsSlinky.three.meshMod.Mesh
import typingsSlinky.three.sphereMod.Sphere
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector3Mod.Vector3
import typingsSlinky.three.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/Geometry", "Geometry")
@js.native
class Geometry () extends EventDispatcher {
  
  var animation: AnimationClip = js.native
  
  var animations: js.Array[AnimationClip] = js.native
  
  /**
  	 * Bakes matrix transform directly into vertex coordinates.
  	 */
  def applyMatrix4(matrix: Matrix4): Geometry = js.native
  
  // These properties do not exist in a normal Geometry class, but if you use the instance that was passed by JSONLoader, it will be added.
  var bones: js.Array[Bone] = js.native
  
  /**
  	 * Bounding box.
  	 * @default null
  	 */
  var boundingBox: Box3 | Null = js.native
  
  /**
  	 * Bounding sphere.
  	 * @default null
  	 */
  var boundingSphere: Sphere | Null = js.native
  
  def center(): Geometry = js.native
  
  /**
  	 * Array of vertex colors, matching number and order of vertices.
  	 * Used in ParticleSystem, Line and Ribbon.
  	 * Meshes use per-face-use-of-vertex colors embedded directly in faces.
  	 * To signal an update in this array, Geometry.colorsNeedUpdate needs to be set to true.
  	 * @default []
  	 */
  var colors: js.Array[Color] = js.native
  
  /**
  	 * Set to true if the colors array has been updated.
  	 * @default false
  	 */
  var colorsNeedUpdate: Boolean = js.native
  
  /**
  	 * Computes bounding box of the geometry, updating {@link Geometry.boundingBox} attribute.
  	 */
  def computeBoundingBox(): Unit = js.native
  
  /**
  	 * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
  	 * Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are null.
  	 */
  def computeBoundingSphere(): Unit = js.native
  
  /**
  	 * Computes face normals.
  	 */
  def computeFaceNormals(): Unit = js.native
  
  /**
  	 * Compute vertex normals, but duplicating face normals.
  	 */
  def computeFlatVertexNormals(): Unit = js.native
  
  /**
  	 * Computes morph normals.
  	 */
  def computeMorphNormals(): Unit = js.native
  
  /**
  	 * Computes vertex normals by averaging face normals.
  	 * Face normals must be existing / computed beforehand.
  	 */
  def computeVertexNormals(): Unit = js.native
  def computeVertexNormals(areaWeighted: Boolean): Unit = js.native
  
  def copy(source: Geometry): this.type = js.native
  
  /**
  	 * Removes The object from memory.
  	 * Don't forget to call this method when you remove an geometry because it can cuase meomory leaks.
  	 */
  def dispose(): Unit = js.native
  
  /**
  	 * Set to true if the faces array has been updated.
  	 * @default false
  	 */
  var elementsNeedUpdate: Boolean = js.native
  
  /**
  	 * Array of face UV layers.
  	 * Each UV layer is an array of UV matching order and number of vertices in faces.
  	 * To signal an update in this array, Geometry.uvsNeedUpdate needs to be set to true.
  	 * @default [[]]
  	 */
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
  
  /**
  	 * Array of triangles or/and quads.
  	 * The array of faces describe how each vertex in the model is connected with each other.
  	 * To signal an update in this array, Geometry.elementsNeedUpdate needs to be set to true.
  	 * @default []
  	 */
  var faces: js.Array[Face3] = js.native
  
  def fromBufferGeometry(geometry: BufferGeometry): Geometry = js.native
  
  /**
  	 *
  	 * @default false
  	 */
  var groupsNeedUpdate: Boolean = js.native
  
  /**
  	 * Unique number of this geometry instance
  	 */
  var id: Double = js.native
  
  val isGeometry: `true` = js.native
  
  /**
  	 * @default []
  	 */
  var lineDistances: js.Array[Double] = js.native
  
  /**
  	 * Set to true if the linedistances array has been updated.
  	 * @default false
  	 */
  var lineDistancesNeedUpdate: Boolean = js.native
  
  def lookAt(vector: Vector3): Unit = js.native
  
  def merge(geometry: Geometry): Unit = js.native
  def merge(geometry: Geometry, matrix: js.UndefOr[scala.Nothing], materialIndexOffset: Double): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = js.native
  
  def mergeMesh(mesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Unit = js.native
  
  /**
  	 * Checks for duplicate vertices using hashmap.
  	 * Duplicated vertices are removed and faces' vertices are updated.
  	 */
  def mergeVertices(): Double = js.native
  
  /**
  	 * Array of morph normals. Morph normals have similar structure as morph targets, each normal set is a Javascript object:
  	 *
  	 *		 morphNormal = { name: "NormalName", normals: [ new THREE.Vector3(), ... ] }
  	 * @default []
  	 */
  var morphNormals: js.Array[MorphNormals] = js.native
  
  /**
  	 * Array of morph targets. Each morph target is a Javascript object:
  	 *
  	 *		 { name: "targetName", vertices: [ new THREE.Vector3(), ... ] }
  	 *
  	 * Morph vertices match number and order of primary vertices.
  	 * @default []
  	 */
  var morphTargets: js.Array[MorphTarget] = js.native
  
  /**
  	 * Name for this geometry. Default is an empty string.
  	 * @default ''
  	 */
  var name: String = js.native
  
  def normalize(): Geometry = js.native
  
  /**
  	 * Set to true if the normals array has been updated.
  	 * @default false
  	 */
  var normalsNeedUpdate: Boolean = js.native
  
  def rotateX(angle: Double): Geometry = js.native
  
  def rotateY(angle: Double): Geometry = js.native
  
  def rotateZ(angle: Double): Geometry = js.native
  
  def scale(x: Double, y: Double, z: Double): Geometry = js.native
  
  def setFromPoints(points: js.Array[Vector2 | Vector3]): this.type = js.native
  
  /**
  	 * Array of skinning indices, matching number and order of vertices.
  	 * @default []
  	 */
  var skinIndices: js.Array[Vector4] = js.native
  
  /**
  	 * Array of skinning weights, matching number and order of vertices.
  	 * @default []
  	 */
  var skinWeights: js.Array[Vector4] = js.native
  
  def sortFacesByMaterialIndex(): Unit = js.native
  
  def toJSON(): js.Any = js.native
  
  def translate(x: Double, y: Double, z: Double): Geometry = js.native
  
  /**
  	 * @default 'Geometry'
  	 */
  var `type`: String = js.native
  
  var uuid: String = js.native
  
  /**
  	 * Set to true if the uvs array has been updated.
  	 * @default false
  	 */
  var uvsNeedUpdate: Boolean = js.native
  
  /**
  	 * The array of vertices hold every position of points of the model.
  	 * To signal an update in this array, Geometry.verticesNeedUpdate needs to be set to true.
  	 * @default []
  	 */
  var vertices: js.Array[Vector3] = js.native
  
  /**
  	 * Set to true if the vertices array has been updated.
  	 * @default false
  	 */
  var verticesNeedUpdate: Boolean = js.native
}
