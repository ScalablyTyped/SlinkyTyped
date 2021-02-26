package typingsSlinky.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fraction extends StObject {
  
  def abs(): Fraction = js.native
  
  def add(param1: Double, param2: Double): Fraction = js.native
  def add(param1: Fraction, param2: Fraction): Fraction = js.native
  
  def copy(copy: Fraction): Fraction = js.native
  
  def divide(param1: Double, param2: Double): Fraction = js.native
  def divide(param1: Fraction, param2: Fraction): Fraction = js.native
  
  def equals(compare: Fraction): Boolean = js.native
  
  def fraction(): Double = js.native
  
  def greaterThan(compare: Fraction): Boolean = js.native
  
  def greaterThanEquals(compare: Fraction): Boolean = js.native
  
  def lessThan(compare: Fraction): Boolean = js.native
  
  def lessThanEquals(compare: Fraction): Boolean = js.native
  
  def multiply(param1: Double, param2: Double): Fraction = js.native
  def multiply(param1: Fraction, param2: Fraction): Fraction = js.native
  
  def parse(str: String): Fraction = js.native
  
  def quotient(): Double = js.native
  
  def set(numerator: Double, denominator: Double): Fraction = js.native
  
  def simplify(): Fraction = js.native
  
  def subtract(param1: Double, param2: Double): Fraction = js.native
  def subtract(param1: Fraction, param2: Fraction): Fraction = js.native
  
  def toMixedString(): String = js.native
  
  def toSimplifiedString(): String = js.native
  
  def value(): Double = js.native
}
