/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveKMultipleConstraint extends RaveKConstraint {
  private long swigCPtr;

  protected RaveKMultipleConstraint(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RaveKMultipleConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveKMultipleConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveKMultipleConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addConstraint(RaveKConstraint constraint) {
    raveJNI.RaveKMultipleConstraint_addConstraint(swigCPtr, this, RaveKConstraint.getCPtr(constraint), constraint);
  }

}
