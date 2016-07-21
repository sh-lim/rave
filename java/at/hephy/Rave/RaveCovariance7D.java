/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveCovariance7D extends RaveCovariance6D {
  private long swigCPtr;

  protected RaveCovariance7D(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RaveCovariance7D_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveCovariance7D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveCovariance7D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RaveCovariance7D(float dxx, float dxy, float dxz, float dyy, float dyz, float dzz, float dxpx, float dxpy, float dxpz, float dypx, float dypy, float dypz, float dzpx, float dzpy, float dzpz, float dpxpx, float dpxpy, float dpxpz, float dpypy, float dpypz, float dpzpz, float dxm, float dym, float dzm, float dpxm, float dpym, float dpzm, float dmm) {
    this(raveJNI.new_RaveCovariance7D__SWIG_0(dxx, dxy, dxz, dyy, dyz, dzz, dxpx, dxpy, dxpz, dypx, dypy, dypz, dzpx, dzpy, dzpz, dpxpx, dpxpy, dpxpz, dpypy, dpypz, dpzpz, dxm, dym, dzm, dpxm, dpym, dpzm, dmm), true);
  }

  public RaveCovariance7D(RaveCovariance6D space_error, float dxm, float dym, float dzm, float dpxm, float dpym, float dpzm, float dmm) {
    this(raveJNI.new_RaveCovariance7D__SWIG_1(RaveCovariance6D.getCPtr(space_error), space_error, dxm, dym, dzm, dpxm, dpym, dpzm, dmm), true);
  }

  public RaveCovariance7D() {
    this(raveJNI.new_RaveCovariance7D__SWIG_2(), true);
  }

  public float dxm() {
    return raveJNI.RaveCovariance7D_dxm(swigCPtr, this);
  }

  public float dym() {
    return raveJNI.RaveCovariance7D_dym(swigCPtr, this);
  }

  public float dzm() {
    return raveJNI.RaveCovariance7D_dzm(swigCPtr, this);
  }

  public float dpxm() {
    return raveJNI.RaveCovariance7D_dpxm(swigCPtr, this);
  }

  public float dpym() {
    return raveJNI.RaveCovariance7D_dpym(swigCPtr, this);
  }

  public float dpzm() {
    return raveJNI.RaveCovariance7D_dpzm(swigCPtr, this);
  }

  public float dmm() {
    return raveJNI.RaveCovariance7D_dmm(swigCPtr, this);
  }

  public boolean equal(RaveCovariance7D other) {
    return raveJNI.RaveCovariance7D_equal(swigCPtr, this, RaveCovariance7D.getCPtr(other), other);
  }

  public String toString() {
    return raveJNI.RaveCovariance7D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveCovariance7D___str__(swigCPtr, this);
  }

}