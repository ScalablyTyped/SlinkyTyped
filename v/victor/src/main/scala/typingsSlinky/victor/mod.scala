package typingsSlinky.victor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("victor", JSImport.Namespace)
  @js.native
  class ^ protected () extends Victor {
    /**
      * Can be used without the new keyword.
      * @param x The X component
      * @param y The Y component
      */
    def this(x: Double, y: Double) = this()
  }
  
  /**
    * Creates vector from array.
    * @param arr array An array that contains the X component in the first element and the Y component in the second
    */
  /* static member */
  @JSImport("victor", "fromArray")
  @js.native
  def fromArray(arr: js.Array[Double]): Victor = js.native
  
  /**
    * Creates vector from object.
    * @param obj An object containing the X component in the x property and the Y component in the y property
    */
  /* static member */
  @JSImport("victor", "fromObject")
  @js.native
  def fromObject(obj: VictorCoordinates): Victor = js.native
  
  @js.native
  trait Victor extends StObject {
    
    /**
      * Same as distanceX but always returns an absolute value.
      * @param vector
      */
    def absDistanceX(vector: Victor): Double = js.native
    
    /**
      * Same as distanceY but always returns an absolute value.
      * @param vector
      */
    def absDistanceY(vector: Victor): Double = js.native
    
    /**
      * Adds another vector to itself.
      * @param vector
      */
    def add(vector: Victor): Victor = js.native
    
    /**
      * Adds the given scalar to both vector axis.
      *
      * @param scalar
      */
    def addScalar(scalar: Double): Victor = js.native
    
    /**
      * Adds the given scalar to the X axis.
      *
      * @param scalar
      */
    def addScalarX(scalar: Double): Victor = js.native
    
    /**
      * Adds the given scalar to the Y axis.
      *
      * @param scalar
      */
    def addScalarY(scalar: Double): Victor = js.native
    
    /**
      * Adds another vector's X component to itself.
      * @param vector
      */
    def addX(vector: Victor): Victor = js.native
    
    /**
      * Adds another vector's Y component to itself.
      * @param vector
      */
    def addY(vector: Victor): Victor = js.native
    
    /**
      * Alias for horizontalAngle.
      */
    def angle(): Double = js.native
    
    /**
      * Alias for horizontalAngleDeg.
      */
    def angleDeg(): Double = js.native
    
    /**
      * Copies the X and Y components of another vector in to itself.
      * @param vector
      */
    def copy(vector: Victor): Victor = js.native
    
    /**
      * Copies the X component of another vector in to itself.
      * @param vector
      */
    def copyX(vector: Victor): Victor = js.native
    
    /**
      * Copies the Y component of another vector in to itself.
      * @param vector
      */
    def copyY(vector: Victor): Victor = js.native
    
    /**
      * Returns the cross product of two vectors.
      * @param vector
      */
    def cross(vector: Victor): Double = js.native
    
    /**
      * Alias for horizontalAngle.
      */
    def direction(): Double = js.native
    
    /**
      * Returns the euclidean distance between two vectors.
      * @param vector
      */
    def distance(vector: Victor): Double = js.native
    
    /**
      * Returns the squared euclidean distance between two vectors. If the distance is only needed for comparison, this function is faster than distance.
      * @param vector
      */
    def distanceSq(vector: Victor): Double = js.native
    
    /**
      * Returns the distance of the X component from another vector.
      * @param vector
      */
    def distanceX(vector: Victor): Double = js.native
    
    /**
      * Returns the distance of the Y component from another vector.
      * @param vector
      */
    def distanceY(vector: Victor): Double = js.native
    
    /**
      * Divides both components by another vector.
      * @param scalar
      */
    def divide(scalar: Victor): Victor = js.native
    
    /**
      * Divides both vector axis by the given scalar value.
      *
      * @param scalar
      */
    def divideScalar(scalar: Double): Victor = js.native
    
    /**
      * Divides the X axis by the given scalar value.
      *
      * @param scalar
      */
    def divideScalarX(scalar: Double): Victor = js.native
    
    /**
      * Divides the Y axis by the given scalar value.
      *
      * @param scalar
      */
    def divideScalarY(scalar: Double): Victor = js.native
    
    /**
      * Divides the X component by the X component of another vector.
      * @param vector
      */
    def divideX(vector: Victor): Victor = js.native
    
    /**
      * Divides the Y component by the Y component of another vector.
      * @param vector
      */
    def divideY(vector: Victor): Victor = js.native
    
    /**
      * Returns the dot product of two vectors.
      * @param vector
      */
    def dot(vector: Victor): Double = js.native
    
    /**
      * Returns the angle towards X in radians.
      */
    def horizontalAngle(): Double = js.native
    
    /**
      * Same as horizontalAngle but returns degrees.
      */
    def horizontalAngleDeg(): Double = js.native
    
    /**
      * Inverts both components.
      */
    def invert(): Victor = js.native
    
    /**
      * Inverts the X component.
      */
    def invertX(): Victor = js.native
    
    /**
      * Inverts the Y component.
      */
    def invertY(): Victor = js.native
    
    /**
      * Returns a true if this vector is the same as another.
      * @param vector
      */
    def isEqualTo(vector: Victor): Boolean = js.native
    
    /**
      * Returns a true if vector is (0, 0).
      */
    def isZero(): Boolean = js.native
    
    /**
      * Returns the length / magnitude.
      */
    def length(): Double = js.native
    
    /**
      * Returns the squared length / magnitude. If the length is only needed for comparison, this function is faster than length.
      */
    def lengthSq(): Double = js.native
    
    /**
      * If either component is greater than max, multiplies the component by multiplier.
      * @param max
      * @param multiplier
      */
    def limit(max: Double, multiplier: Double): Victor = js.native
    
    /**
      * Alias for length.
      */
    def magnitude(): Double = js.native
    
    /**
      * Performs a linear blend / interpolation towards another vector.
      * @param vector
      * @param amount
      */
    def mix(vector: Victor, amount: Double): Victor = js.native
    
    /**
      * Performs a linear blend / interpolation of the X component towards another vector.
      * @param vector Number amount Value between 0 and 1. Default: 0.5
      * @param amount
      */
    def mixX(vector: Victor, amount: Double): Victor = js.native
    
    /**
      * Performs a linear blend / interpolation of the Y component towards another vector.
      * @param vector
      * @param amount
      */
    def mixY(vector: Victor, amount: Double): Victor = js.native
    
    /**
      * Multiplies both components with another vector.
      * @param vector
      */
    def multiply(vector: Victor): Victor = js.native
    
    /**
      * Multiplies both vector axis by the given scalar value
      *
      * @param scalar
      */
    def multiplyScalar(scalar: Double): Victor = js.native
    
    /**
      * Multiplies the X axis by the given scalar
      *
      * @param scalar
      */
    def multiplyScalarX(scalar: Double): Victor = js.native
    
    /**
      * Multiplies the Y axis by the given scalar
      *
      * @param scalar
      */
    def multiplyScalarY(scalar: Double): Victor = js.native
    
    /**
      * Multiplies the X component with the X component of another vector.
      * @param vector
      */
    def multiplyX(vector: Victor): Victor = js.native
    
    /**
      * Multiplies the Y component with the Y component of another vector.
      * @param vector
      */
    def multiplyY(vector: Victor): Victor = js.native
    
    /**
      * Alias of normalize.
      */
    def norm(): Victor = js.native
    
    /**
      * Normalizes the vector by scaling it down to a length of 1 while keeping its direction.
      */
    def normalize(): Victor = js.native
    
    /**
      * Projects a vector onto another vector, setting itself to the result.
      * @param vector
      */
    def projectOnto(vector: Victor): Victor = js.native
    
    /**
      * Randomizes the components with a value between topLeft and bottomRight.
      * @param topLeft
      * @param bottomRight
      */
    def randomize(topLeft: Victor, bottomRight: Victor): Victor = js.native
    
    /**
      * Randomly randomizes either the X component or the Y component with a value between topLeft and bottomRight.
      * @param topLeft
      * @param bottomRight
      */
    def randomizeAny(topLeft: Victor, bottomRight: Victor): Victor = js.native
    
    /**
      * Randomizes the X component with a value between topLeft and bottomRight.
      * @param topLeft
      * @param bottomRight
      */
    def randomizeX(topLeft: Victor, bottomRight: Victor): Victor = js.native
    
    /**
      * Randomizes the Y component with a value between topLeft and bottomRight.
      * @param topLeft
      * @param bottomRight
      */
    def randomizeY(topLeft: Victor, bottomRight: Victor): Victor = js.native
    
    /**
      * Rotates the vector to a certain angle, in radians CCW from +X axis.
      * @param angle
      */
    def rotate(angle: Double): Victor = js.native
    
    /**
      * Rotates the vector by a rotation angle, given in radians CCW from +X axis.
      * @param rotation
      */
    def rotateBy(rotation: Double): Victor = js.native
    
    /**
      * Same as rotateBy but uses degrees
      * @param rotation
      */
    def rotateByDeg(rotation: Double): Victor = js.native
    
    /**
      * Same as rotate but uses degrees
      * @param angle
      */
    def rotateDeg(angle: Double): Victor = js.native
    
    /**
      * Subtracts another vector from itself.
      * @param vector
      */
    def subtract(vector: Victor): Victor = js.native
    
    /**
      * Subtracts the given scalar from both axis.
      *
      * @param scalar
      */
    def subtractScalar(scalar: Double): Victor = js.native
    
    /**
      * Subtracts the given scalar from the X axis.
      *
      * @param scalar
      */
    def subtractScalarX(scalar: Double): Victor = js.native
    
    /**
      * Subtracts the given scalar from the Y axis.
      *
      * @param scalar
      */
    def subtractScalarY(scalar: Double): Victor = js.native
    
    /**
      * Subtracts another vector's X component from itself.
      * @param vector
      */
    def subtractX(vector: Victor): Victor = js.native
    
    /**
      * Subtracts another vector's Y component from itself.
      * @param vector
      */
    def subtractY(vector: Victor): Victor = js.native
    
    /**
      * Returns an array representation of the X and Y components.
      */
    def toArray(): js.Array[Double] = js.native
    
    /**
      * Rounds both axis to a certain precision.
      */
    def toFixed(): Victor = js.native
    
    /**
      * Returns an object representation of tha X and Y components.
      */
    def toObject(): VictorCoordinates = js.native
    
    /**
      * Rounds the components to integer numbers.
      */
    def unfloat(): Victor = js.native
    
    /**
      * Returns the angle towards Y in radians.
      */
    def verticalAngle(): Double = js.native
    
    /**
      * Same as verticalAngle but returns degrees.
      */
    def verticalAngleDeg(): Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    /**
      * Sets the vector to zero (0,0).
      */
    def zero(): Victor = js.native
  }
  object Victor {
    
    @scala.inline
    def apply(
      absDistanceX: Victor => Double,
      absDistanceY: Victor => Double,
      add: Victor => Victor,
      addScalar: Double => Victor,
      addScalarX: Double => Victor,
      addScalarY: Double => Victor,
      addX: Victor => Victor,
      addY: Victor => Victor,
      angle: () => Double,
      angleDeg: () => Double,
      copy: Victor => Victor,
      copyX: Victor => Victor,
      copyY: Victor => Victor,
      cross: Victor => Double,
      direction: () => Double,
      distance: Victor => Double,
      distanceSq: Victor => Double,
      distanceX: Victor => Double,
      distanceY: Victor => Double,
      divide: Victor => Victor,
      divideScalar: Double => Victor,
      divideScalarX: Double => Victor,
      divideScalarY: Double => Victor,
      divideX: Victor => Victor,
      divideY: Victor => Victor,
      dot: Victor => Double,
      horizontalAngle: () => Double,
      horizontalAngleDeg: () => Double,
      invert: () => Victor,
      invertX: () => Victor,
      invertY: () => Victor,
      isEqualTo: Victor => Boolean,
      isZero: () => Boolean,
      length: () => Double,
      lengthSq: () => Double,
      limit: (Double, Double) => Victor,
      magnitude: () => Double,
      mix: (Victor, Double) => Victor,
      mixX: (Victor, Double) => Victor,
      mixY: (Victor, Double) => Victor,
      multiply: Victor => Victor,
      multiplyScalar: Double => Victor,
      multiplyScalarX: Double => Victor,
      multiplyScalarY: Double => Victor,
      multiplyX: Victor => Victor,
      multiplyY: Victor => Victor,
      norm: () => Victor,
      normalize: () => Victor,
      projectOnto: Victor => Victor,
      randomize: (Victor, Victor) => Victor,
      randomizeAny: (Victor, Victor) => Victor,
      randomizeX: (Victor, Victor) => Victor,
      randomizeY: (Victor, Victor) => Victor,
      rotate: Double => Victor,
      rotateBy: Double => Victor,
      rotateByDeg: Double => Victor,
      rotateDeg: Double => Victor,
      subtract: Victor => Victor,
      subtractScalar: Double => Victor,
      subtractScalarX: Double => Victor,
      subtractScalarY: Double => Victor,
      subtractX: Victor => Victor,
      subtractY: Victor => Victor,
      toArray: () => js.Array[Double],
      toFixed: () => Victor,
      toObject: () => VictorCoordinates,
      unfloat: () => Victor,
      verticalAngle: () => Double,
      verticalAngleDeg: () => Double,
      x: Double,
      y: Double,
      zero: () => Victor
    ): Victor = {
      val __obj = js.Dynamic.literal(absDistanceX = js.Any.fromFunction1(absDistanceX), absDistanceY = js.Any.fromFunction1(absDistanceY), add = js.Any.fromFunction1(add), addScalar = js.Any.fromFunction1(addScalar), addScalarX = js.Any.fromFunction1(addScalarX), addScalarY = js.Any.fromFunction1(addScalarY), addX = js.Any.fromFunction1(addX), addY = js.Any.fromFunction1(addY), angle = js.Any.fromFunction0(angle), angleDeg = js.Any.fromFunction0(angleDeg), copy = js.Any.fromFunction1(copy), copyX = js.Any.fromFunction1(copyX), copyY = js.Any.fromFunction1(copyY), cross = js.Any.fromFunction1(cross), direction = js.Any.fromFunction0(direction), distance = js.Any.fromFunction1(distance), distanceSq = js.Any.fromFunction1(distanceSq), distanceX = js.Any.fromFunction1(distanceX), distanceY = js.Any.fromFunction1(distanceY), divide = js.Any.fromFunction1(divide), divideScalar = js.Any.fromFunction1(divideScalar), divideScalarX = js.Any.fromFunction1(divideScalarX), divideScalarY = js.Any.fromFunction1(divideScalarY), divideX = js.Any.fromFunction1(divideX), divideY = js.Any.fromFunction1(divideY), dot = js.Any.fromFunction1(dot), horizontalAngle = js.Any.fromFunction0(horizontalAngle), horizontalAngleDeg = js.Any.fromFunction0(horizontalAngleDeg), invert = js.Any.fromFunction0(invert), invertX = js.Any.fromFunction0(invertX), invertY = js.Any.fromFunction0(invertY), isEqualTo = js.Any.fromFunction1(isEqualTo), isZero = js.Any.fromFunction0(isZero), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), limit = js.Any.fromFunction2(limit), magnitude = js.Any.fromFunction0(magnitude), mix = js.Any.fromFunction2(mix), mixX = js.Any.fromFunction2(mixX), mixY = js.Any.fromFunction2(mixY), multiply = js.Any.fromFunction1(multiply), multiplyScalar = js.Any.fromFunction1(multiplyScalar), multiplyScalarX = js.Any.fromFunction1(multiplyScalarX), multiplyScalarY = js.Any.fromFunction1(multiplyScalarY), multiplyX = js.Any.fromFunction1(multiplyX), multiplyY = js.Any.fromFunction1(multiplyY), norm = js.Any.fromFunction0(norm), normalize = js.Any.fromFunction0(normalize), projectOnto = js.Any.fromFunction1(projectOnto), randomize = js.Any.fromFunction2(randomize), randomizeAny = js.Any.fromFunction2(randomizeAny), randomizeX = js.Any.fromFunction2(randomizeX), randomizeY = js.Any.fromFunction2(randomizeY), rotate = js.Any.fromFunction1(rotate), rotateBy = js.Any.fromFunction1(rotateBy), rotateByDeg = js.Any.fromFunction1(rotateByDeg), rotateDeg = js.Any.fromFunction1(rotateDeg), subtract = js.Any.fromFunction1(subtract), subtractScalar = js.Any.fromFunction1(subtractScalar), subtractScalarX = js.Any.fromFunction1(subtractScalarX), subtractScalarY = js.Any.fromFunction1(subtractScalarY), subtractX = js.Any.fromFunction1(subtractX), subtractY = js.Any.fromFunction1(subtractY), toArray = js.Any.fromFunction0(toArray), toFixed = js.Any.fromFunction0(toFixed), toObject = js.Any.fromFunction0(toObject), unfloat = js.Any.fromFunction0(unfloat), verticalAngle = js.Any.fromFunction0(verticalAngle), verticalAngleDeg = js.Any.fromFunction0(verticalAngleDeg), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Victor]
    }
    
    @scala.inline
    implicit class VictorMutableBuilder[Self <: Victor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsDistanceX(value: Victor => Double): Self = StObject.set(x, "absDistanceX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAbsDistanceY(value: Victor => Double): Self = StObject.set(x, "absDistanceY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdd(value: Victor => Victor): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddScalar(value: Double => Victor): Self = StObject.set(x, "addScalar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddScalarX(value: Double => Victor): Self = StObject.set(x, "addScalarX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddScalarY(value: Double => Victor): Self = StObject.set(x, "addScalarY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddX(value: Victor => Victor): Self = StObject.set(x, "addX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddY(value: Victor => Victor): Self = StObject.set(x, "addY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAngle(value: () => Double): Self = StObject.set(x, "angle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAngleDeg(value: () => Double): Self = StObject.set(x, "angleDeg", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCopy(value: Victor => Victor): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyX(value: Victor => Victor): Self = StObject.set(x, "copyX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyY(value: Victor => Victor): Self = StObject.set(x, "copyY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCross(value: Victor => Double): Self = StObject.set(x, "cross", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirection(value: () => Double): Self = StObject.set(x, "direction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDistance(value: Victor => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDistanceSq(value: Victor => Double): Self = StObject.set(x, "distanceSq", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDistanceX(value: Victor => Double): Self = StObject.set(x, "distanceX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDistanceY(value: Victor => Double): Self = StObject.set(x, "distanceY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivide(value: Victor => Victor): Self = StObject.set(x, "divide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivideScalar(value: Double => Victor): Self = StObject.set(x, "divideScalar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivideScalarX(value: Double => Victor): Self = StObject.set(x, "divideScalarX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivideScalarY(value: Double => Victor): Self = StObject.set(x, "divideScalarY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivideX(value: Victor => Victor): Self = StObject.set(x, "divideX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDivideY(value: Victor => Victor): Self = StObject.set(x, "divideY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDot(value: Victor => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHorizontalAngle(value: () => Double): Self = StObject.set(x, "horizontalAngle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHorizontalAngleDeg(value: () => Double): Self = StObject.set(x, "horizontalAngleDeg", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvert(value: () => Victor): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvertX(value: () => Victor): Self = StObject.set(x, "invertX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvertY(value: () => Victor): Self = StObject.set(x, "invertY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEqualTo(value: Victor => Boolean): Self = StObject.set(x, "isEqualTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsZero(value: () => Boolean): Self = StObject.set(x, "isZero", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLengthSq(value: () => Double): Self = StObject.set(x, "lengthSq", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLimit(value: (Double, Double) => Victor): Self = StObject.set(x, "limit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMagnitude(value: () => Double): Self = StObject.set(x, "magnitude", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMix(value: (Victor, Double) => Victor): Self = StObject.set(x, "mix", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMixX(value: (Victor, Double) => Victor): Self = StObject.set(x, "mixX", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMixY(value: (Victor, Double) => Victor): Self = StObject.set(x, "mixY", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiply(value: Victor => Victor): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiplyScalar(value: Double => Victor): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiplyScalarX(value: Double => Victor): Self = StObject.set(x, "multiplyScalarX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiplyScalarY(value: Double => Victor): Self = StObject.set(x, "multiplyScalarY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiplyX(value: Victor => Victor): Self = StObject.set(x, "multiplyX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiplyY(value: Victor => Victor): Self = StObject.set(x, "multiplyY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNorm(value: () => Victor): Self = StObject.set(x, "norm", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNormalize(value: () => Victor): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProjectOnto(value: Victor => Victor): Self = StObject.set(x, "projectOnto", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRandomize(value: (Victor, Victor) => Victor): Self = StObject.set(x, "randomize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandomizeAny(value: (Victor, Victor) => Victor): Self = StObject.set(x, "randomizeAny", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandomizeX(value: (Victor, Victor) => Victor): Self = StObject.set(x, "randomizeX", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandomizeY(value: (Victor, Victor) => Victor): Self = StObject.set(x, "randomizeY", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRotate(value: Double => Victor): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateBy(value: Double => Victor): Self = StObject.set(x, "rotateBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateByDeg(value: Double => Victor): Self = StObject.set(x, "rotateByDeg", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateDeg(value: Double => Victor): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtract(value: Victor => Victor): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractScalar(value: Double => Victor): Self = StObject.set(x, "subtractScalar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractScalarX(value: Double => Victor): Self = StObject.set(x, "subtractScalarX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractScalarY(value: Double => Victor): Self = StObject.set(x, "subtractScalarY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractX(value: Victor => Victor): Self = StObject.set(x, "subtractX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtractY(value: Victor => Victor): Self = StObject.set(x, "subtractY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToFixed(value: () => Victor): Self = StObject.set(x, "toFixed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToObject(value: () => VictorCoordinates): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnfloat(value: () => Victor): Self = StObject.set(x, "unfloat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVerticalAngle(value: () => Double): Self = StObject.set(x, "verticalAngle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVerticalAngleDeg(value: () => Double): Self = StObject.set(x, "verticalAngleDeg", js.Any.fromFunction0(value))
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: () => Victor): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VictorCoordinates extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object VictorCoordinates {
    
    @scala.inline
    def apply(x: Double, y: Double): VictorCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictorCoordinates]
    }
    
    @scala.inline
    implicit class VictorCoordinatesMutableBuilder[Self <: VictorCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
