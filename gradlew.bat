<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".adminactivity.AddSystemUsers">

    <EditText
        android:id="@+id/edt_addSystemUser_name"
        android:layout_width="wrap_content"
        android:layout_height="40dp"
        android:layout_marginTop="68dp"
        android:ems="10"
        android:hint="@string/admin_add_system_users_name_hint"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.08"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/edt_addSystemUser_surname"
        android:layout_width="wrap_content"
        android:layout_height="40dp"
        android:layout_marginTop="20dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="@string/admin_add_system_users_surname_hint"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.08"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_addSystemUser_name" />

    <EditText
        android:id="@+id/edt_addSystemUser_username"
        android:layout_width="wrap_content"
        android:layout_height="40dp"
        android:layout_marginTop="20dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Username"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.08"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_addSystemUser_surname" />

    <EditText
        android:id="@+id/edt_addSystemUser_idNumber"
        android:layout_width="wrap_content"
        android:layout_height="40dp"
        android:layout_marginTop="20dp"
        android:ems="10"